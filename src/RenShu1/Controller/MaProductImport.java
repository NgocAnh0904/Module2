package RenShu1.Controller;


import RenShu1.Common.NotFoundProductException;
import RenShu1.Common.ReadAndWrite;
import RenShu1.Common.Validate;
import RenShu1.Models.ProductExport;
import RenShu1.Models.ProductImport;
import RenShu1.View.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaProductImport {
    static int countId;

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static List<ProductImport> readProductImportCSV() {
        List<ProductImport> productList = new ArrayList<>();
        List<String[]> lineArr= ReadAndWrite.readFile("src/RenShu1/Data/Products.csv");
        for (String[] line : lineArr) {
            if (line.length == 9) {
                ProductImport product = new ProductImport(line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7], line[8]);
                productList.add(product);
            }
        }
        return productList;
    }

    public static void setCountId() {
        List<String[]> lineArr= ReadAndWrite.readFile("src/RenShu1/Data/Products.csv");
        for (String[] line : lineArr) {
            if (countId < Integer.parseInt(line[0])) {
                countId = Integer.parseInt(line[0]);
            }
        }
    }

    public static void addNewProduct() {
        setCountId();
        ProductImport productImport = new ProductImport();
        countId++;
        productImport.setId(String.valueOf(countId));
        productImport.setIdProduct("Product-Im-" + String.format("%04d", countId));
        System.out.println("Enter name product: ");
        productImport.setNameProduct(Validate.regexRequire(getScanner().nextLine()));
        System.out.println("Enter price product: ");
        productImport.setPrice(Validate.regexNum(getScanner().nextLine()));
        System.out.println("Enter number product: ");
        productImport.setNumber(Validate.regexNum(getScanner().nextLine()));
        System.out.println("Enter brand product: ");
        productImport.setBrand(Validate.regexRequire(getScanner().nextLine()));
        System.out.println("Enter price product import: ");
        productImport.setPriceImport(Validate.regexNum(getScanner().nextLine()));
        System.out.println("Enter address import: ");
        productImport.setAddressImport(Validate.regexRequire(getScanner().nextLine()));
        System.out.println("Enter tax import: ");
        productImport.setTaxImport(Validate.regexRequire(getScanner().nextLine()));
        String line = productImport.getId() + "," + productImport.getIdProduct() + "," + productImport.getNameProduct()
                + "," + productImport.getPrice() + "," + productImport.getNumber() + "," + productImport.getBrand()
                + "," + productImport.getPriceImport() + "," + productImport.getAddressImport() + "," + productImport.getTaxImport();
        ReadAndWrite.writeFile("src/RenShu1/Data/Products.csv", line);
    }

    public static void displayProductImport() {
        List<ProductImport> productImportList = readProductImportCSV();
        if (productImportList.size() == 0){
            System.out.println("List is null!");
            return;
        }
        for (ProductImport p: productImportList) {
            p.showInfo();
        }
    }

    public static void editProductImport() {
        List<ProductImport> productImportList = readProductImportCSV();
        displayProductImport();
        System.out.println("Enter id card product, you want to edit: ");
        String idProduct = getScanner().nextLine();
        boolean isHas = false;
        try {
            for (ProductImport p : productImportList) {
                if (idProduct.equals(p.getIdProduct())) {
                    chosePropertyToEdit(p);
                    isHas = true;
                    isYesNo(productImportList);
                    break;
                }
            }
            if (!isHas) {
                throw new NotFoundProductException("This name isn't exist!!");
            }
        } catch (NotFoundProductException e) {
            e.printStackTrace();
            MaController.displayMainMenu();
        }
    }

    public static void deleteProductImport() {
        List<ProductImport> productImportList = readProductImportCSV();
        displayProductImport();
        System.out.println("Enter name product, you want to delete: ");
        String nameProduct = getScanner().nextLine();
        boolean isHas = false;
        try {
            for (ProductImport p : productImportList) {
                if (nameProduct.equals(p.getNameProduct())) {
                    productImportList.remove(p);
                    isHas = true;
                    isYesNo(productImportList);
                    break;
                }
            }
            if (!isHas) {
                throw new NotFoundProductException("This name isn't exist!!");
            }
        } catch (NotFoundProductException e) {
            e.printStackTrace();
            MaController.displayMainMenu();
        }
    }

    private static void chosePropertyToEdit(ProductImport productImport) {
        choseHeader();
        switch (Integer.parseInt(Validate.regexNum(getScanner().nextLine()))) {
            case 1: {
                System.out.println("Enter new name product: ");
                productImport.setNameProduct(Validate.regexRequire(getScanner().nextLine()));
                break;
            }
            case 2: {
                System.out.println("Enter price product: ");
                productImport.setPrice(Validate.regexNum(getScanner().nextLine()));
                break;
            }
            case 3: {
                System.out.println("Enter new number product: ");
                productImport.setNumber(Validate.regexNum(getScanner().nextLine()));
                break;
            }
            case 4: {
                System.out.println("Enter new brand product: ");
                productImport.setBrand(Validate.regexRequire(getScanner().nextLine()));
                break;
            }
            case 5: {
                System.out.println("Enter price import product: ");
                productImport.setPriceImport(Validate.regexNum(getScanner().nextLine()));
                break;
            }
            case 6: {
                System.out.println("Enter address import: ");
                productImport.setAddressImport(Validate.regexRequire(getScanner().nextLine()));
                break;
            }
            case 7: {
                System.out.println("Enter tax import: ");
                productImport.setTaxImport(Validate.regexRequire(getScanner().nextLine()));
                break;
            }
            case 8: {
                MaController.displayMainMenu();
                break;
            }
            default: {
                chosePropertyToEdit(productImport);
            }
        }
    }

    private static void choseHeader() {
        System.out.println("1. Name product." +
                "\n2. Price product." +
                "\n3. Number product." +
                "\n4. Brand product." +
                "\n5. Price import product." +
                "\n6. Address import." +
                "\n7. Tax import." +
                "\n8. Cancel edit." +
                "\nEnter number: ");
    }

    private static void isYesNo(List<ProductImport> productImportList) {
        System.out.println("1. Yes/Other. No\nDo you sure?");
        List<ProductExport> productExportList = MaProductExport.readProductExportCSV();
        switch (Integer.parseInt(getScanner().nextLine())) {
            case 1: {
                String line = "";
                for (ProductImport productImport: productImportList) {
                    line += productImport.getId() + "," + productImport.getIdProduct() + "," + productImport.getNameProduct()
                            + "," + productImport.getPrice() + "," + productImport.getNumber() + "," + productImport.getBrand()
                            + "," + productImport.getPriceImport() + "," + productImport.getAddressImport() + "," + productImport.getTaxImport() + "\n";
                }
                for (ProductExport productExport: productExportList) {
                    line += productExport.getId() + "," + productExport.getIdProduct() + "," + productExport.getNameProduct()
                            + "," + productExport.getPrice() + "," + productExport.getNumber() + "," + productExport.getBrand()
                            + "," + productExport.getPriceExport() + "," + productExport.getAddressExport() + "\n";
                }
                ReadAndWrite.writeFileInNewFile("src/RenShu1/Data/Products.csv", line);
                break;
            }
            default: {
                new MainController().displayMainMenu();
            }
        }
    }
}
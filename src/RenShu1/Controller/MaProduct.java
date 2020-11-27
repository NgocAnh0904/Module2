package RenShu1.Controller;

import RenShu1.Common.ReadAndWrite;
import RenShu1.Common.Validate;
import RenShu1.Models.Product;
import RenShu1.Models.ProductExport;
import RenShu1.Models.ProductImport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaProduct {

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static List<Product> readProductCSV() {
        List<Product> productList = new ArrayList<>();
        List<String[]> lineArr= ReadAndWrite.readFile("src/RenShu1/Data/Products.csv");
        for (String[] line : lineArr) {
            if (line.length == 9) {
                Product product = new ProductImport(line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7], line[8]);
                productList.add(product);
            }else {
                Product product = new ProductExport(line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7]);
                productList.add(product);
            }
        }
        return productList;
    }

    public static void addNewProduct() {
        String choseNum;
        do {
            System.out.println("1. Add new product import.\n2. Add new product export.\n3. Back to menu.\n0. Exit.\nEnter number:");
            choseNum = Validate.regexNum(getScanner().nextLine());
            switch (Integer.parseInt(choseNum)) {
                case 1: {
                    MaProductImport.addNewProduct();
                    break;
                }
                case 2: {
                    MaProductExport.addNewProduct();
                    break;
                }
                case 3: {
                    MaController.displayMainMenu();
                    break;
                }
                default: {
                    System.out.println("----This number isn't exist!----");
                }
            }
        }while (choseNum != "0");
    }

    public static void showProduct() {
        String choseNum;
        do {
            System.out.println("1. Show product import.\n2. Show product export.\n3. Back to menu.\n0. Exit.\nEnter number:");
            choseNum = Validate.regexNum(getScanner().nextLine());
            switch (Integer.parseInt(choseNum)) {
                case 1: {
                    MaProductImport.displayProductImport();
                    break;
                }
                case 2: {
                    MaProductExport.displayProductExport();
                    break;
                }
                case 3: {
                    MaController.displayMainMenu();
                    break;
                }
            }
        }while (choseNum != "0");
    }

    public static void editProduct() {
        String choseNum;
        do {
            System.out.println("1. Edit product import.\n2. Edit product export.\n3. Back to menu.\n0. Exit.\nEnter number:");
            choseNum = Validate.regexNum(getScanner().nextLine());
            switch (Integer.parseInt(choseNum)) {
                case 1: {
                    MaProductImport.editProductImport();
                    break;
                }
                case 2: {
                    MaProductExport.editProductExport();
                    break;
                }
                case 3: {
                    MaController.displayMainMenu();
                    break;
                }
            }
        }while (choseNum != "0");
    }

    public static void deleteProduct() {
        String choseNum;
        do {
            System.out.println("1. Delete product import.\n2. Delete product export.\n3. Back to menu.\n0. Exit.\nEnter number:");
            choseNum = Validate.regexNum(getScanner().nextLine());
            switch (Integer.parseInt(choseNum)) {
                case 1: {
                    MaProductImport.deleteProductImport();
                    break;
                }
                case 2: {
                    MaProductExport.deleteProductExport();
                    break;
                }
                case 3: {
                    MaController.displayMainMenu();
                    break;
                }
            }
        }while (Integer.parseInt(choseNum) != 0);
    }

    public static void searchProduct() {
        List<Product> productList = readProductCSV();
        System.out.println("Enter name product, you want to find: ");
        String nameProduct = Validate.regexRequire(getScanner().nextLine());
        boolean isHas = false;
        for (Product p : productList) {
            if (p.getNameProduct().toLowerCase().contains(nameProduct.toLowerCase())) {
                p.showInfo();
                isHas = true;
            }
        }
        if (!isHas) {
            System.out.println("This name isn't exist!!");
        }
    }
}
//© 2020 GitHub, Inc.
//        Terms
//        Privacy
//        Security
//        Status
//        Help
//        Contact GitHub
//        Pricing
//        API
//        Training
//        Blog
//        About


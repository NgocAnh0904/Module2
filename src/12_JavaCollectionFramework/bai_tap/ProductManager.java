package JavaCollectionFramework.bai_tap;

import JavaCollectionFramework.thuc_hanh.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager{
    public static int count = 1;
    public static List<Product> list = new ArrayList<>();

    public ProductManager() {
    }

//    public ProductManager(int id, int cost, String name) {
//        super(id, cost, name);
//    }

    public Scanner getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void addProductNew() {
        Product product = new Product();
        product.setId(count++);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        product.setName(scanner.nextLine());
        System.out.println("Nhap gia: ");
        product.setCost(scanner.nextInt());
        list.add(product);
        System.out.println("Nhap thanh cong");
    }

//    public String inputName() {
//        System.out.println("Nhap ten：");
//        return getInput().nextLine();
//    }
//
//    public int inputCost() {
//        System.out.println("Nhap so Gia: " + "VND");
//        return getInput().nextInt();
//    }

    public void displayProduct() {
        for (Product p : list) {
            System.out.println("ID : " + p.getId());
            System.out.println("Name : " + p.getName());
            System.out.println("Cost : " + p.getCost());
            System.out.println("\n ---------------------------------");
        }
    }

    public void removeProduct() {
        System.out.println("Nhap ID san pham muon xoa: ");
        int id = getInput().nextInt();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                System.out.println("Xoa thanh cong");
            } else {
                System.out.println("Khong thuoc danh sach san pham");
            }
        }
    }

    public void searchProduct() {
        boolean check = false;
        System.out.println("Nhap ten san pham muon tim: ");
        String name = getInput().nextLine();
        for (Product p : list) {
            if (p.getName().equals(name)) {
                System.out.println("ID " + p.getId() +
                        "\n Name: " + p.getName() +
                        "\n Cost: " + p.getCost());
                check = true;
            }
        }
        if (!check) {
            System.out.println("Khong tim thay san pham");
        }
    }

    public void sortProduct() {
        CostComparator amountComparator = new CostComparator(true);
        Collections.sort(list, amountComparator);
        System.out.println("Sap xep thanh cong tu be den lon");
    }

    public void sortedProduct() {
        CostComparator costComparator = new CostComparator(false);
        Collections.sort(list, costComparator);
        System.out.println("Sap xep thanh cong tu lon den be");
    }

    public void editProduct() {
        boolean check = false;
        System.out.println("Nhap ID san pham muon Edit: ");
        int id = getInput().nextInt();
        for (Product p : list) {
            if (p.getId() == id) {
                System.out.println("Nhap lai ten san pham: ");
                p.setName(getInput().nextLine());
                System.out.println("Nhap lai Gia: ");
                p.setCost(getInput().nextInt());
                System.out.println("Edit thanh cong");
                check = true;
            }
        }
        if (!check) {
            System.out.println("Khong tim thay san pham");
        }
    }

}

package JavaCollectionFramework.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager product = new ProductManager();
        boolean check = true;
        do {
            System.out.println(" 1. Them san pham moi " +
                    "\n 2. Hien thi san pham" +
                    "\n 3. Xoa san pham theo ID" +
                    "\n 4. Tim kiem san pham theo ten" +
                    "\n 5. Sap xep san pham theo gia tu be den lon" +
                    "\n 6. Sap xep san pham theo gia tu lon den be" +
                    "\n 7. Edit san pham theo ID" +
                    "\n 8. Edit");
            switch (getInput().nextInt()) {
                case 1: {
                    product.addProductNew();
                    break;
                }
                case 2: {
                    product.displayProduct();
                    break;
                }
                case 3: {
                    product.removeProduct();
                    break;
                }
                case 4: {
                    product.searchProduct();
                    break;
                }
                case 5: {
                    product.sortProduct();
                    break;
                }
                case 6: {
                    product.sortedProduct();
                    break;
                }
                case 7: {
                    product.editProduct();
                    break;
                }
                case 8: {
                    check = false;
                    break;
                }
            }
        }
        while (check);
    }

    public static Scanner getInput() {
        Scanner input = new Scanner(System.in);
        return input;
    }
}
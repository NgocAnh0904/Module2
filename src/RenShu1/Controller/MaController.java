package RenShu1.Controller;

import RenShu1.Common.Validate;

import java.util.Scanner;

public class MaController {

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void displayMainMenu() {
        String choseNum;
        do {
            System.out.println("1.\tAdd new product\n" +
                    "2.\tDelete product\n" +
                    "3.\tShow product\n" +
                    "4.\tSearch product\n" +
                    "5.\tEdit product\n" +
                    "6.\tExit\n" +
                    "Enter number:");
            choseNum = Validate.regexNum(getScanner().nextLine());
            switch (Integer.parseInt(choseNum)) {
                case 1: {
                    MaProduct.addNewProduct();
                    break;
                }
                case 2: {
                    MaProduct.deleteProduct();
                    break;
                }
                case 3: {
                    MaProduct.showProduct();
                    break;
                }
                case 4: {
                    MaProduct.searchProduct();
                }
                case 5: {
                    MaProduct.editProduct();
                }
                default: {
                    System.out.println("----This number isn't exist!----");
                }
            }
        }while (choseNum != "0");
    }
}

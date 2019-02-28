import ui.*;

import java.util.Scanner;

public class Menu {

    private final static ListProductCategoriesUI listProductCategoriesUI = new ListProductCategoriesUI();
    private final static ListProductsUI listProductsUI = new ListProductsUI();
    private final static ListUsersUI listUsersUI = new ListUsersUI();
    private final static RegisterProductCategoryUI registerProductCategoryUI = new RegisterProductCategoryUI();
    private final static RegisterProductUI registerProductUI = new RegisterProductUI();
    private final static RegisterUserUI registerUserUI = new RegisterUserUI();

    public static void loop() {
        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    registerUserUI.registerUser();
                    break;
                case 2:
                    registerProductUI.registerProduct();
                    break;
                case 3:
                    registerProductCategoryUI.registerProductCategory();
                    break;
                case 4:
                    listUsersUI.listUsers();
                    break;
                case 5:
                    listProductsUI.listProducts();
                    break;
                case 6:
                    listProductCategoriesUI.listProductCategories();
                    break;
                default:
                    System.out.println("Please enter a valid option...\n");
                    break;
            }
        } while (option != 0);
    }

    private static int menu() {
        System.out.println("=============================");
        System.out.println("JPA Example App");
        System.out.println("=============================");
        System.out.println("1. Register User");
        System.out.println("2. Register Product");
        System.out.println("3. Register Product Category\n");
        System.out.println("4. List All Users");
        System.out.println("4. List All Products");
        System.out.println("5. List All Product Categories\n");
        System.out.println("0. Exit\n");
        System.out.println("Enter an option...\n");
        return new Scanner(System.in).nextInt();
    }

}

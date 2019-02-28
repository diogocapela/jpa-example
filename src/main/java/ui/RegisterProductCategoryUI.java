package ui;

import controller.RegisterProductCategoryController;

import java.util.Scanner;

public class RegisterProductCategoryUI {

    private final Scanner scanner = new Scanner(System.in);
    private final RegisterProductCategoryController controller = new RegisterProductCategoryController();

    public void registerProductCategory() {
        System.out.println("Register Product Category:");
        System.out.println("=============================");
        System.out.println("TITLE:");
        String title = scanner.nextLine();
        System.out.println("Registering product category...");
        controller.registerProductCategory(title);
        System.out.println("Product category registered successfully!\n");
    }

}

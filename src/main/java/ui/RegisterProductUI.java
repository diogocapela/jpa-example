package ui;

import controller.ListProductCategoriesController;
import controller.ListProductsController;
import controller.RegisterProductController;
import model.ProductCategory;

import java.util.List;
import java.util.Scanner;
public class RegisterProductUI {

    private final Scanner scanner = new Scanner(System.in);
    private final ListProductCategoriesController listProductCategoriesController = new ListProductCategoriesController();
    private final RegisterProductController registerProductController = new RegisterProductController();

    public void registerProduct() {
        System.out.println("Product Categoryes:");
        System.out.println("=============================");
        List<ProductCategory> productCategories = listProductCategoriesController.listProductCategories();
        for (ProductCategory productCategory : productCategories) {
            System.out.println(productCategory);
        }
        System.out.println("\n");
        System.out.println("Register Product:");
        System.out.println("=============================");
        System.out.println("TITLE:");
        String title = scanner.nextLine();
        System.out.println("PRODUCT CATEGORY ID:");
        Integer categoryId = scanner.nextInt();
        System.out.println("Registering product...");
        registerProductController.registerProduct(title, productCategories.get(categoryId));
        System.out.println("Group registered successfully!\n");
    }

}

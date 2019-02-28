package ui;

import controller.ListProductCategoriesController;
import model.ProductCategory;

import java.util.List;

public class ListProductCategoriesUI {

    private final ListProductCategoriesController controller = new ListProductCategoriesController();

    public void listProductCategories() {
        System.out.println("Listing Product Categories...");
        List<ProductCategory> productCategories = controller.listProductCategories();
        System.out.println("Product Categories:");
        System.out.println("=============================");
        for (ProductCategory productCategory : productCategories) {
            System.out.println(productCategory);
        }
        System.out.println("\n");
        System.out.println("Product categories listed successfully!\n");
    }

}


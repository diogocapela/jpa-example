package ui;

import controller.ListProductsController;
import model.Product;

import java.util.List;

public class ListProductsUI {

    private final ListProductsController controller = new ListProductsController();

    public void listProducts() {
        System.out.println("Listing Products...");
        List<Product> products = controller.listProducts();
        System.out.println("Products:");
        System.out.println("=============================");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("\n");
        System.out.println("Products listed successfully!.\n");
    }

}

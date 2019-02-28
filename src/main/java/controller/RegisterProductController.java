package controller;

import model.Product;
import model.ProductCategory;
import repository.ProductRepository;

public class RegisterProductController {

    private final ProductRepository repository = new ProductRepository();

    public Product registerProduct(String title, ProductCategory category) {
        return repository.add(new Product(title, category));
    }

}

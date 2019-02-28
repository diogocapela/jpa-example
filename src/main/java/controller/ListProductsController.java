package controller;

import model.Product;
import repository.ProductRepository;

import java.util.List;

public class ListProductsController {

    private final ProductRepository repository = new ProductRepository();

    public List<Product> listProducts() {
        return repository.findAll();
    }

}

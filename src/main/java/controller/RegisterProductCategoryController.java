package controller;

import model.ProductCategory;
import repository.ProductCategoryRepository;

public class RegisterProductCategoryController {

    private final ProductCategoryRepository repository = new ProductCategoryRepository();

    public ProductCategory registerProductCategory(String title) {
        return repository.add(new ProductCategory(title));
    }

}

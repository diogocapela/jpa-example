package controller;

import model.ProductCategory;
import repository.ProductCategoryRepository;

import java.util.List;

public class ListProductCategoriesController {

    private final ProductCategoryRepository repository = new ProductCategoryRepository();

    public List<ProductCategory> listProductCategories() {
        return repository.findAll();
    }

}

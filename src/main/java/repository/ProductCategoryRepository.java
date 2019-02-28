package repository;

import model.ProductCategory;

public class ProductCategoryRepository extends JPARepository<ProductCategory, Double> {

    @Override
    protected String persistenceUnitName() {
        return "DATABASE_01";
    }

}

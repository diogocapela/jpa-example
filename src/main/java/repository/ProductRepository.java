package repository;

import model.Product;

public class ProductRepository extends JPARepository<Product, Double> {

    @Override
    protected String persistenceUnitName() {
        return "DATABASE_01";
    }

}

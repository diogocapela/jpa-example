package repository;

import model.User;

public class UserRepository extends JPARepository<User, Double> {

    @Override
    protected String persistenceUnitName() {
        return "DATABASE_01";
    }

}

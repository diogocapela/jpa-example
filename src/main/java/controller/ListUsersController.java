package controller;

import model.User;
import repository.UserRepository;

import java.util.List;

public class ListUsersController {

    private final UserRepository repository = new UserRepository();

    public List<User> listUsers() {
        return repository.findAll();
    }

}

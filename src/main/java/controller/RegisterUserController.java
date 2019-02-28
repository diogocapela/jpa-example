package controller;

import model.User;
import repository.UserRepository;

public class RegisterUserController {

    private final UserRepository repository = new UserRepository();

    public User registerUser(String email, String name) {
        return repository.add(new User(email, name));
    }

}

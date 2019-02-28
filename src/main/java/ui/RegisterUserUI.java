package ui;

import controller.RegisterUserController;

import java.util.Scanner;

public class RegisterUserUI {

    private final Scanner scanner = new Scanner(System.in);
    private final RegisterUserController controller = new RegisterUserController();

    public void registerUser() {
        System.out.println("Register User:");
        System.out.println("=============================");
        System.out.println("EMAIL:");
        String email = scanner.nextLine();
        System.out.println("NAME:");
        String name = scanner.nextLine();
        System.out.println("Registering user...");
        controller.registerUser(email, name);
        System.out.println("User registered successfully!\n");
    }

}

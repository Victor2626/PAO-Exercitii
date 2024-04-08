package proiect.services;
import proiect.daoservices.UserRepositoryService;
import proiect.model.User;

import java.util.Scanner;
import java.util.List;

public class UserService {
    private UserRepositoryService userRepositoryService;

    public UserService() {
        this.userRepositoryService = new UserRepositoryService();
    }

    public void createUser(Scanner scanner) {
        System.out.println("Creating a new User:");
        String name = getUserInput(scanner, "Enter user name: ", "User name cannot be empty. Please enter a valid name.");
        String email = getUserInput(scanner, "Enter email: ", "Email cannot be empty. Please enter a valid email.");
        String password = getUserInput(scanner, "Enter password: ", "Password cannot be empty. Please enter a valid password.");
        String address = getUserInput(scanner, "Enter address: ", "Address cannot be empty. Please enter a valid address.");
        double discountRate = getDiscountRate(scanner);
        User user = new User(0, name, email, password, address, discountRate);
        userRepositoryService.addUser(user);
        System.out.println("User created successfully.");
    }

    private String getUserInput(Scanner scanner, String prompt, String errorMessage) {
        String input = "";
        while (input == null || input.trim().isEmpty()) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println(errorMessage);
            }
        }
        return input;
    }

    private double getDiscountRate(Scanner scanner) {
        double discountRate = -1;
        while (discountRate < 0) {
            System.out.print("Enter discount rate (0 to 1): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("That's not a valid number. Please enter a valid discount rate.");
                scanner.next();
                System.out.print("Enter discount rate (0 to 1): ");
            }
            discountRate = scanner.nextDouble();
            scanner.nextLine();
            if (discountRate < 0 || discountRate > 1) {
                System.out.println("Discount rate must be between 0 and 1. Please enter a valid discount rate.");
                discountRate = -1;
            }
        }
        return discountRate;
    }

    public void viewUser(Scanner scanner) {
        System.out.print("Enter user ID to view details: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        User user = userRepositoryService.getUserById(id);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("User not found.");
        }
    }

    public void updateUser(Scanner scanner) {
        System.out.print("Enter user ID for update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        User existingUser = userRepositoryService.getUserById(id);
        if (existingUser == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("Updating User:");
        String newAddress = getUserInput(scanner, "Enter new address: ", "Address cannot be empty. Please enter a valid address.");
        double newDiscountRate = getDiscountRate(scanner);
        existingUser.setAddress(newAddress);
        existingUser.setDiscountRate(newDiscountRate);
        userRepositoryService.updateUser(id, existingUser);
        System.out.println("User updated successfully.");
    }

    public void deleteUser(Scanner scanner) {
        System.out.println("Deleting a User:");
        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        User user = userRepositoryService.getUserById(id);
        if (user != null) {
            userRepositoryService.removeUser(user);
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("User not found.");
        }
    }
}


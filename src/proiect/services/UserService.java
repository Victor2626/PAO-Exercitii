package proiect.services;

import proiect.daoservices.UserRepositoryService;
import proiect.model.User;

import java.util.Scanner;
import java.sql.SQLException;
import static proiect.utils.Constants.AUDIT_FILE;
public class UserService {
    private UserRepositoryService databaseService;

    public UserService(UserRepositoryService databaseService) {
        this.databaseService = databaseService;
    }

    public void createUser(Scanner scanner) throws SQLException {
        System.out.println("Enter user details:");
        System.out.println("Id:");
        Integer id = Integer.valueOf(scanner.nextLine());
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();
        System.out.println("Address:");
        String address = scanner.nextLine();
        System.out.println("DiscountRate:");
        Double discountRate = Double.valueOf(scanner.nextLine());
        databaseService.createUser(id, name, email, password, address, discountRate);
    }

//    private String getUserInput(Scanner scanner, String prompt, String errorMessage) {
//        String input = "";
//        while (input == null || input.trim().isEmpty()) {
//            System.out.print(prompt);
//            input = scanner.nextLine();
//            if (input == null || input.trim().isEmpty()) {
//                System.out.println(errorMessage);
//            }
//        }
//        return input;
//    }

//    private double getDiscountRate(Scanner scanner) {
//        double discountRate = -1;
//        while (discountRate < 0) {
//            System.out.print("Enter discount rate (0 to 1): ");
//            while (!scanner.hasNextDouble()) {
//                System.out.println("That's not a valid number. Please enter a valid discount rate.");
//                scanner.next();
//                System.out.print("Enter discount rate (0 to 1): ");
//            }
//            discountRate = scanner.nextDouble();
//            scanner.nextLine();
//            if (discountRate < 0 || discountRate > 1) {
//                System.out.println("Discount rate must be between 0 and 1. Please enter a valid discount rate.");
//                discountRate = -1;
//            }
//        }
//        return discountRate;
//    }

    public void viewUser(Scanner scanner) throws SQLException {
        System.out.println("Enter the city of the location to find:");
        Integer id = Integer.valueOf(scanner.nextLine());
        databaseService.getUserById(id);
    }
    public void removeUser(Scanner scanner) throws SQLException {
        System.out.println("Enter the name of the user to remove:");
        Integer id = Integer.valueOf(scanner.nextLine());
        databaseService.removeUser(id);
    }
    public void updateUser(Scanner scanner) throws SQLException {
        System.out.print("Enter user ID for update: ");
        Integer id = Integer.valueOf(scanner.nextLine());
        User existingUser = databaseService.getUserById(id);
        if (existingUser == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("Updating User:");
        System.out.println("Enter new address:");
        String newAddress = scanner.nextLine();
        System.out.println("Enter new discount rate:");
        Double newDiscountRate = Double.valueOf(scanner.nextLine());
        existingUser.setAddress(newAddress);
        existingUser.setDiscountRate(newDiscountRate);
        databaseService.updateUser(id, existingUser);
        System.out.println("User updated successfully.");
    }
    }

//    public void updateUser(Scanner scanner) throws SQLException {
//        System.out.print("Enter user ID for update: ");
//        Integer id = scanner.nextInt();
//        scanner.nextLine();
//        User existingUser = userRepositoryService.getUserById(id);
//        if (existingUser == null) {
//            System.out.println("User not found.");
//            return;
//        }
//        System.out.println("Updating User:");
//        String newAddress = getUserInput(scanner, "Enter new address: ", "Address cannot be empty. Please enter a valid address.");
//        double newDiscountRate = getDiscountRate(scanner);
//        existingUser.setAddress(newAddress);
//        existingUser.setDiscountRate(newDiscountRate);
//        userRepositoryService.updateUser(id, existingUser);
//        System.out.println("User updated successfully.");
//    }





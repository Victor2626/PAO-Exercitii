package proiect;

import proiect.daoservices.UserRepositoryService;
import proiect.services.*;
import proiect.model.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        LivratorService livratorService = new LivratorService();
        UserRepositoryService userRepositoryService = new UserRepositoryService();
        UserService userService = new UserService(userRepositoryService);

        while (true){
            menu();

            String command = scanner.nextLine().toLowerCase();
            System.out.println("Command received: " + command);
            switch (command){
                case "create":
                    userService.createUser(scanner);
                    break;
                case "read":
                    userService.viewUser(scanner);
                    break;
                case "delete":
                    userService.updateUser(scanner);
                    break;
                case "update":
                    userService.removeUser(scanner);
                    break;
                case "quit":
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void menu() {
        System.out.println("Available commands:");
        System.out.println("create");
        System.out.println("view");
        System.out.println("update");
        System.out.println("delete");
        System.out.println("quit");
        System.out.println("Enter command:");
    }
}

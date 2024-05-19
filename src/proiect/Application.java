package proiect;

import proiect.daoservices.LivratorRepositoryService;
import proiect.daoservices.UserRepositoryService;
import proiect.services.*;
import proiect.model.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        LivratorRepositoryService livratorRepositoryService = new LivratorRepositoryService();
        LivratorService livratorService = new LivratorService(livratorRepositoryService);
        UserRepositoryService userRepositoryService = new UserRepositoryService();
        UserService userService = new UserService(userRepositoryService);

        while (true) {
            mainMenu();
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "user":
                    userMenu(scanner, userService);
                    break;
                case "livrator":
                    livratorMenu(scanner, livratorService);
                    break;
                case "quit":
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void mainMenu() {
        System.out.println("Choose entity:");
        System.out.println("user");
        System.out.println("livrator");
        System.out.println("quit");
        System.out.println("Enter choice:");
    }

    private static void userMenu(Scanner scanner, UserService userService) throws SQLException {
        while (true) {
            menu("User");
            String command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "create":
                    userService.createUser(scanner);
                    break;
                case "view":
                    userService.viewUser(scanner);
                    break;
                case "update":
                    userService.updateUser(scanner);
                    break;
                case "delete":
                    userService.removeUser(scanner);
                    break;
                case "back":
                    return;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void livratorMenu(Scanner scanner, LivratorService livratorService) throws SQLException {
        while (true) {
            menu("Livrator");
            String command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "create":
                    livratorService.createLivrator(scanner);
                    break;
                case "view":
                    livratorService.viewLivrator(scanner);
                    break;
                case "update":
                    livratorService.updateLivrator(scanner);
                    break;
                case "delete":
                    livratorService.removeLivrator(scanner);
                    break;
                case "back":
                    return;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void menu(String entity) {
        System.out.println("Available commands for " + entity + ":");
        System.out.println("create");
        System.out.println("view");
        System.out.println("update");
        System.out.println("delete");
        System.out.println("back");
        System.out.println("Enter command:");
    }
}

package proiect;

import proiect.services.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComandaService comandaService = new ComandaService();
        LivratorService livratorService = new LivratorService();
        PromotieService promotieService = new PromotieService();
        RestaurantService restaurantService = new RestaurantService();
        UserService userService = new UserService();

        while (true){
            menu();

            String command = scanner.nextLine().toLowerCase();
            System.out.println("Command received: " + command);
            switch (command){
                case "create":
                    userService.createUser(scanner);
                    break;
                case "view":
                    userService.viewUser(scanner);
                    break;
                case "delete":
                    userService.deleteUser(scanner);
                    break;
                case "update":
                    userService.updateUser(scanner);
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
        System.out.println("get");
        System.out.println("Enter command:");
    }
}

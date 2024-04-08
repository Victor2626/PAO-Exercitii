package proiect.services;

import proiect.daoservices.RestaurantRepositoryService;
import proiect.model.Mancare;
import proiect.model.Recenzie;
import proiect.model.Restaurant;
import proiect.model.User;

import java.util.*;

public class RestaurantService {
    private RestaurantRepositoryService restaurantRepositoryService;

    public RestaurantService() {
        this.restaurantRepositoryService = new RestaurantRepositoryService();
    }

    public void createRestaurant(Scanner scanner) {
        System.out.println("Creating a new Restaurant:");
        String name = getRestaurantName(scanner);
        String address = getRestaurantAddress(scanner);
        Map<Mancare, Boolean> menu = getRestaurantMenu(scanner);
        int averagePreparationTime = getAveragePreparationTime(scanner);
        Set<Recenzie> recenzii = getRestaurantReviews(scanner);
        Restaurant restaurant = new Restaurant(0, name, address, menu, averagePreparationTime, recenzii);
        restaurantRepositoryService.addRestaurant(restaurant);
        System.out.println("Restaurant created successfully.");
    }



    private String getRestaurantName(Scanner scanner) {
        System.out.print("Enter restaurant name: ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty()) {
            System.out.println("Restaurant name cannot be empty. Please enter a valid name.");
            System.out.print("Enter restaurant name: ");
            name = scanner.nextLine().trim();
        }
        return name;
    }

    private String getRestaurantAddress(Scanner scanner) {
        System.out.print("Enter restaurant address: ");
        String address = scanner.nextLine().trim();
        while (address.isEmpty()) {
            System.out.println("Restaurant address cannot be empty. Please enter a valid address.");
            System.out.print("Enter restaurant address: ");
            address = scanner.nextLine().trim();
        }
        return address;
    }

    private Map<Mancare, Boolean> getRestaurantMenu(Scanner scanner) {
        Map<Mancare, Boolean> menu = new HashMap<>();
        System.out.println("Enter menu items (type 'done' when finished):");
        while (true) {
            System.out.print("Enter dish name or 'done': ");
            String dishName = scanner.nextLine();
            if ("done".equalsIgnoreCase(dishName)) {
                break;
            }
            System.out.print("Enter dish price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            menu.put(new Mancare(0, dishName, price), true);
        }
        return menu;
    }

    private int getAveragePreparationTime(Scanner scanner) {
        System.out.print("Enter average preparation time in minutes: ");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a valid number. Please enter a valid preparation time.");
            scanner.next();
            System.out.print("Enter average preparation time in minutes: ");
        }
        int time = scanner.nextInt();
        scanner.nextLine();
        return time;
    }

    private Set<Recenzie> getRestaurantReviews(Scanner scanner) {
        Set<Recenzie> reviews = new HashSet<>();
        System.out.println("Enter reviews (type 'done' when finished):");
        while (true) {
            System.out.print("Enter user ID or 'done' to finish: ");
            String input = scanner.nextLine();
            if ("done".equalsIgnoreCase(input)) {
                break;
            }
            int userId = Integer.parseInt(input);


            System.out.print("Enter user name: ");
            String userName = scanner.nextLine();

            System.out.print("Enter user email: ");
            String userEmail = scanner.nextLine();

            System.out.print("Enter user password: ");
            String userPassword = scanner.nextLine();

            System.out.print("Enter user address: ");
            String userAddress = scanner.nextLine();

            System.out.print("Enter user discount rate: ");
            double userDiscountRate = scanner.nextDouble();
            scanner.nextLine();
            User user = new User(userId, userName, userEmail, userPassword, userAddress, userDiscountRate);

            System.out.print("Enter restaurant comment: ");
            String comment = scanner.nextLine();

            System.out.print("Enter rating: ");
            int rating = scanner.nextInt();
            scanner.nextLine();


            Recenzie review = new Recenzie(0, user, comment, rating);
            reviews.add(review);
        }
        return reviews;
    }



}



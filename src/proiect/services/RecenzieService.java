//package proiect.services;
//
//import proiect.daoservices.RecenzieRepositoryService;
//import proiect.model.Recenzie;
//import proiect.model.User;
//
//import java.util.Scanner;
//
//public class RecenzieService {
//    private RecenzieRepositoryService recenzieRepositoryService;
//
//    public RecenzieService() {
//        this.recenzieRepositoryService = new RecenzieRepositoryService();
//    }
//
//    public void createRecenzie(Scanner scanner) {
//        System.out.println("Creating a new Review:");
//        int userId = getIntInput(scanner, "Enter user ID: ", "User ID cannot be empty. Please enter a valid ID.");
//        User user = new UserService().getUserById(userId); // Assuming you have a method to get a user by ID
//        if (user == null) {
//            System.out.println("User not found. Cannot create review.");
//            return;
//        }
//        String comment = getUserInput(scanner, "Enter comment: ", "Comment cannot be empty. Please enter a valid comment.");
//        int rating = getRating(scanner);
//        Recenzie recenzie = new Recenzie(0, user, comment, rating);
//        recenzieRepositoryService.addRecenzie(recenzie);
//        System.out.println("Review created successfully.");
//    }
//
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
//
//    private int getRating(Scanner scanner) {
//        int rating = -1;
//        while (rating < 1 || rating > 5) {
//            System.out.print("Enter rating (1 to 5): ");
//            while (!scanner.hasNextInt()) {
//                System.out.println("That's not a valid number. Please enter a valid rating.");
//                scanner.next();
//                System.out.print("Enter rating (1 to 5): ");
//            }
//            rating = scanner.nextInt();
//            scanner.nextLine();
//            if (rating < 1 || rating > 5) {
//                System.out.println("Rating must be between 1 and 5. Please enter a valid rating.");
//                rating = -1;
//            }
//        }
//        return rating;
//    }
//
//    private int getIntInput(Scanner scanner, String prompt, String errorMessage) {
//        int input = -1;
//        while (input < 0) {
//            System.out.print(prompt);
//            while (!scanner.hasNextInt()) {
//                System.out.println(errorMessage);
//                scanner.next();
//                System.out.print(prompt);
//            }
//            input = scanner.nextInt();
//            scanner.nextLine();
//        }
//        return input;
//    }
//
//    public void viewRecenzie(Scanner scanner) {
//        System.out.print("Enter review ID to view details: ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        Recenzie recenzie = recenzieRepositoryService.getRecenzieById(id);
//        if (recenzie != null) {
//            System.out.println(recenzie);
//        } else {
//            System.out.println("Review not found.");
//        }
//    }
//
//    public void updateRecenzie(Scanner scanner) {
//        System.out.print("Enter review ID for update: ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        Recenzie existingRecenzie = recenzieRepositoryService.getRecenzieById(id);
//        if (existingRecenzie == null) {
//            System.out.println("Review not found.");
//            return;
//        }
//        System.out.println("Updating Review:");
//        String newComment = getUserInput(scanner, "Enter new comment: ", "Comment cannot be empty. Please enter a valid comment.");
//        int newRating = getRating(scanner);
//        existingRecenzie.setComment(newComment);
//        existingRecenzie.setRating(newRating);
//        recenzieRepositoryService.updateRecenzie(id, existingRecenzie);
//        System.out.println("Review updated successfully.");
//    }
//
//    public void deleteRecenzie(Scanner scanner) {
//        System.out.println("Deleting a Review:");
//        System.out.print("Enter review ID: ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        Recenzie recenzie = recenzieRepositoryService.getRecenzieById(id);
//        if (recenzie != null) {
//            recenzieRepositoryService.removeRecenzie(recenzie);
//            System.out.println("Review deleted successfully.");
//        } else {
//            System.out.println("Review not found.");
//        }
//    }
//}

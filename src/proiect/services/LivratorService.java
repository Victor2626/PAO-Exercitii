package proiect.services;

import proiect.daoservices.LivratorRepositoryService;
import proiect.model.Livrator;
import proiect.model.User;

import java.util.Scanner;
import java.util.List;

public class LivratorService {
    private LivratorRepositoryService livratorRepositoryService;

    public LivratorService() {
        this.livratorRepositoryService = new LivratorRepositoryService();
    }

    public void createLivrator(Scanner scanner) {
        System.out.println("Creating a new Delivery Person:");
        String name = getLivratorName(scanner);
        int estimatedDeliveryTime = getEstimatedDeliveryTime(scanner);
        Livrator livrator = new Livrator(0, name, estimatedDeliveryTime);
        livratorRepositoryService.addLivrator(livrator);
        System.out.println("Delivery Person created successfully.");
    }

    private String getLivratorName(Scanner scanner) {
        String name = "";
        while (name == null || name.trim().isEmpty()) {
            System.out.print("Enter delivery person's name: ");
            name = scanner.nextLine();
            if (name == null || name.trim().isEmpty()) {
                System.out.println("Delivery person's name cannot be empty. Please enter a valid name.");
            }
        }
        return name;
    }

    private int getEstimatedDeliveryTime(Scanner scanner) {
        int estimatedDeliveryTime = 0;
        while (estimatedDeliveryTime <= 0) {
            System.out.print("Enter estimated delivery time (in minutes): ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number. Please enter a valid estimated delivery time.");
                scanner.next();
                System.out.print("Enter estimated delivery time (in minutes): ");
            }
            estimatedDeliveryTime = scanner.nextInt();
            scanner.nextLine();
            if (estimatedDeliveryTime <= 0) {
                System.out.println("Estimated delivery time must be greater than 0. Please enter a valid time.");
            }
        }
        return estimatedDeliveryTime;
    }

    public void viewLivrator(Scanner scanner) {
        System.out.print("Enter delivery person's ID to view details: ");
        int id = scanner.nextInt();
        Livrator livrator = livratorRepositoryService.getLivratorById(id);
        if (livrator != null) {
            System.out.println(livrator);
        } else {
            System.out.println("Delivery Person not found.");
        }
    }

    public void updateLivrator(Scanner scanner) {
        System.out.println("Updating a Delivery Person:");
        System.out.print("Enter delivery person's ID: ");
        int id = scanner.nextInt();
        Livrator existingLivrator = livratorRepositoryService.getLivratorById(id);
        if (existingLivrator == null) {
            System.out.println("Delivery Person not found.");
            return;
        }
        int newEstimatedDeliveryTime = getEstimatedDeliveryTime(scanner);
        existingLivrator.setEstimatedDeliveryTime(newEstimatedDeliveryTime);
        livratorRepositoryService.updateLivrator(id, existingLivrator);
        System.out.println("Delivery Person updated successfully.");
    }

    public void deleteLivrator(Scanner scanner) {
        System.out.println("Deleting a Delivery Person:");
        System.out.print("Enter delivery person's ID: ");
        int id = scanner.nextInt();
        Livrator livrator = livratorRepositoryService.getLivratorById(id);
        if (livrator != null) {
            livratorRepositoryService.removeLivrator(livrator);
            System.out.println("Delivery Person deleted successfully.");
        } else {
            System.out.println("Delivery Person not found.");
        }
    }
    public Livrator getLivratorById(int livratorId) {
        return livratorRepositoryService.getLivratorById(livratorId);
    }
}


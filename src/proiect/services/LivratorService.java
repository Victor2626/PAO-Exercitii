package proiect.services;

import proiect.daoservices.LivratorRepositoryService;
import proiect.model.Livrator;
import static proiect.utils.Constants.AUDIT_FILE;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.List;

public class LivratorService {
    private LivratorRepositoryService databaseService;

    public LivratorService(LivratorRepositoryService databaseService) {
        this.databaseService = databaseService;
    }

    public void createLivrator(Scanner scanner) throws SQLException {
        System.out.println("Enter livrator details:");
        System.out.println("Id:");
        Integer id = Integer.valueOf(scanner.nextLine());
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("EstimatedDeliveryTime:");
        Integer estimatedDeliveryTime = Integer.valueOf(scanner.nextLine());
        databaseService.createLivrator(id, name, estimatedDeliveryTime);
    }

    public void viewLivrator(Scanner scanner) throws SQLException {
        System.out.println("Enter the id of the livrator to find:");
        Integer id = Integer.valueOf(scanner.nextLine());
        databaseService.getLivratorById(id);
    }
    public void removeLivrator(Scanner scanner) throws SQLException {
        System.out.println("Enter the id of the livrator to remove:");
        Integer id = Integer.valueOf(scanner.nextLine());
        databaseService.removeLivrator(id);
    }
    public void updateLivrator(Scanner scanner) throws SQLException {
        System.out.print("Enter livrator ID for update: ");
        Integer id = Integer.valueOf(scanner.nextLine());
        Livrator existingLivrator = databaseService.getLivratorById(id);
        if (existingLivrator == null) {
            System.out.println("Livrator not found.");
            return;
        }
        System.out.println("Updating Livrator:");
        System.out.println("Enter new estimatedDeliveryTime:");
        Integer newEstimatedDeliveryTime = Integer.valueOf(scanner.nextLine());
        existingLivrator.setEstimatedDeliveryTime(newEstimatedDeliveryTime);
        databaseService.updateLivrator(id, existingLivrator);
        System.out.println("User updated successfully.");
    }
}


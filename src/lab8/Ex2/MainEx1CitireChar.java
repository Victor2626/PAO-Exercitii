package lab8.Ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainEx1CitireChar {
    public static void main(String[] args) {
        writeData();
    }

    public static void writeData() {
        Map<String, Integer> nameCounts = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("persoaneChar.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 2) {
                    String fullName = parts[0] + " " + parts[1];
                    nameCounts.put(fullName, nameCounts.getOrDefault(fullName, 0) + 1);
                }
            }

            for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " apare de " + entry.getValue() + " ori");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found", e);
        } catch (IOException e) {
            throw new RuntimeException("IO Exception", e);
        }
    }

}

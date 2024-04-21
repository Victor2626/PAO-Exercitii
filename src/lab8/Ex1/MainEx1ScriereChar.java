package lab8.Ex1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainEx1ScriereChar {
    public static void main(String[] args){
        for(int i = 0; i < 3;i++){
            readData();
        }
    }
    public static void readData(){
        try (BufferedWriter fos = new BufferedWriter(new FileWriter("persoaneChar.txt", true))) {
            Scanner s = new Scanner(System.in);
            System.out.println("Nume: ");
            String nume = s.nextLine();
            System.out.println("Prenume: ");
            String prenume = s.nextLine();
            System.out.println("Varsta: ");
            int varsta = s.nextInt();
            System.out.println("Suma: ");
            double suma = s.nextDouble();
            System.out.println("Valuta: ");
            s.nextLine();
            String valuta = s.nextLine();

            verificaSuma(suma);

            String persoana = nume + ";" + prenume + ";" + varsta + ";" + suma + ";" + valuta + "\n";
            fos.write(persoana);
        } catch (Suma2000 e) {
            readData();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void verificaSuma(double suma) throws Suma2000 {
        if(suma > 2000){
            System.out.println("Suma depaseste 2000");
            throw new Suma2000("Suma este > 2000");
        }
    }
}

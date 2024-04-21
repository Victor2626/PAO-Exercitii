package lab8.Ex3;

import lab8.Ex1.Suma2000;

import java.util.Arrays;
import java.util.Scanner;

public class MainEx2ScriereOcteti {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            readData();
        }
    }

    public static void readData(){
        try {
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

            checkSum(suma);

            Person personCurenta = new Person(nume, prenume, varsta, suma, valuta);
            FileManagement.scriereObiectInFisier("persoaneOcteti.txt", personCurenta);
        } catch (Suma2000 e) {
            readData();
        }
    }

    private static void checkSum(double suma) throws Suma2000 {
        if(suma > 2000){
            System.out.println("Suma depaseste 2000");
            throw new Suma2000("Suma este > 2000");
        }
    }

    private static void serializarePersoane(Person persoanaCurenta) {
        String fisierPersoane = "persoaneOcteti.txt";

        FileManagement.scriereObiectInFisier(fisierPersoane, persoanaCurenta);

        Arrays.stream(FileManagement.citireObiectDinFisier(fisierPersoane)).toList().forEach(p -> System.out.println(p));
    }
}

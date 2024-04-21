package lab8.Ex4;

import lab8.Ex3.FileManagement;

import java.util.Arrays;

public class MainEx2CitireOcteti {
    public static void main(String[] args) {
        Arrays.stream(FileManagement.citireObiectDinFisier("persoaneOcteti.txt")).toList().forEach(p -> System.out.println(p));
    }
}

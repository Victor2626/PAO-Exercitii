package lab10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ex3 {
    public static void main(String[] args) {
        Magazin[] magazine = new Magazin[8];
        magazine[0] = new Magazin("Magazin1", 26);
        magazine[1] = new Magazin("Magazin2", 12);
        magazine[2] = new Magazin("Magazin3", 20);
        magazine[3] = new Magazin("Magazin4", 5);
        magazine[4] = new Magazin("Magazin5", 34);
        magazine[5] = new Magazin("Magazin6", 50);
        magazine[6] = new Magazin("Magazin7", 80);
        magazine[7] = new Magazin("Magazin8", 100);

        System.out.println("Display the stores grouped by number of employees:");
        Map<Integer, List<Magazin>> grouped_by_numarAngajati = Arrays.stream(magazine).collect(Collectors.groupingBy(Magazin::getNumarAngajati));
        grouped_by_numarAngajati.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println();

        System.out.println("Display the sum of employees from all stores:");
        Map<Integer, Integer> sum_of_employees_map = Arrays.stream(magazine).collect(Collectors.
                groupingBy(Magazin::getNumarAngajati, Collectors.summingInt(Magazin::getNumarAngajati)));
        System.out.println(sum_of_employees_map.values().stream().reduce(0, Integer::sum));
    }
}

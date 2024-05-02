package lab10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ex2 {
    public static void main(String[] args){
        int array_of_integers[] = {36, 32, 20, 46, 77, 12, 23, 1, 1, 9, 44, 26, 21, 99, 67};
        Integer[] array_output = Arrays.stream(array_of_integers).boxed().toArray(Integer[]::new);

        System.out.println("Sort array in ascending order:");
        Arrays.sort(array_output, Comparator.naturalOrder());
        System.out.println(Arrays.toString(array_output));

        System.out.println("Sort array in descending order:");
        System.out.println(Arrays.stream(array_output).sorted((a,b) -> b-a).collect(Collectors.toList()));

        System.out.println("Square of array elements:");
        System.out.println(Arrays.stream(array_output).map(a -> a*a).collect(Collectors.toList()));
    }

}


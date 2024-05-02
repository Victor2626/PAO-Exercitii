package lab10;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class ex1 {
    public static void main(String[] args) {
        Integer array_of_integers[] = {36, 32, 20, 46, 77, 12, 23, 1, 1, 9, 44, 26, 21, 99, 67};

        System.out.println("Sort array in descending order:");
        Arrays.sort(array_of_integers, (a,b) -> b-a);
        System.out.println(Arrays.toString(array_of_integers));

        System.out.println("Calculate sum of array elements using reduce:");
        int sum_of_array_reduce = Arrays.stream(array_of_integers).reduce(0, Integer::sum);
        System.out.println(sum_of_array_reduce);

        System.out.println("Calculate sum of array elements using summingInt:");
        int sum_of_array_summingInt = Arrays.stream(array_of_integers).collect(summingInt(Integer::intValue));
        System.out.println(sum_of_array_summingInt);

        System.out.println("Calculate average of array elements using averagingInt:");
        double average_of_array_averagingInt = Arrays.stream(array_of_integers).collect(averagingInt(Integer::intValue));
        System.out.println(average_of_array_averagingInt);

        System.out.println("Maximum element in array:");
        int max_element_of_array = Arrays.stream(array_of_integers).max((a,b) -> a-b).get();
        System.out.println(max_element_of_array);

        System.out.println("Minimum element in array:");
        int min_element_of_array = Arrays.stream(array_of_integers).min((a, b) -> a-b).get();
        System.out.println(min_element_of_array);
        System.out.println("Filter elements greater than a certain value:");
        Integer[] filtered_array_greater_than_certain_value = Arrays.stream(array_of_integers).filter(a -> a > 12).
                sorted(Comparator.comparing(Integer::intValue)).toArray(Integer[]::new);
        System.out.println(Arrays.toString(filtered_array_greater_than_certain_value));
    }
}

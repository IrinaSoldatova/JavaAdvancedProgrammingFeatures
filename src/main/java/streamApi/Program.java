package streamApi;

import java.util.Arrays;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        List<Integer> listNumber = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,14);
        Double avgEvenNumbers = listNumber.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .average()
                .orElse(0.0);

        System.out.println(avgEvenNumbers);
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 1, 3, 2, 5);

        // Calculating squares and sorting based on squared values
        List<Integer> sortedNumbers = numbers.stream()
                .sorted((a, b) -> Integer.compare(a * a, b * b))
                .collect(Collectors.toList());

        // Printing numbers sorted by their squared values
        for (int num : sortedNumbers) {
            System.out.println("Original: " + num + ", Squared: " + (num * num));
        }
    }
}

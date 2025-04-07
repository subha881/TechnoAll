import java.util.Arrays;
import java.util.List;

public class CountryNameLength {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("India", "USA", "Brazil", "Japan", "China", "Nepal");

        // Printing countries with length greater than 4
        for (String country : countries) {
            if (country.length() > 4) {
                System.out.println(country);
            }
        }
    }
}

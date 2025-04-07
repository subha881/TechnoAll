import java.util.Arrays;
import java.util.List;

public class CityNameStartWithP {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Paris", "London", "Pune", "Berlin", "Panama", "New York");

        // Printing city names starting with 'P'
        for (String city : cities) {
            if (city.startsWith("P")) {
                System.out.println(city);
            }
        }
    }
}

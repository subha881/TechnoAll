import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        
        double exponentialValue = Math.exp(number);
        System.out.println("Exponential value of " + number + " is: " + exponentialValue);

        
        double naturalLogarithm = Math.log(exponentialValue);
        System.out.println("Natural logarithm of " + exponentialValue + " is: " + naturalLogarithm);
    }
}

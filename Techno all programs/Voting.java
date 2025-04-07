import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's age
        System.out.print("Enter the student's age: ");
        int age = scanner.nextInt();

        // Check if the student's age is more than 18
        if (age > 18) {
            System.out.println("The student is eligible for voting.");
        } else {
            System.out.println("The student is not eligible for voting.");
        }

        // Close the scanner
        scanner.close();
    }
}

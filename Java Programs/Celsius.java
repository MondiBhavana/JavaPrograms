import java.util.Scanner;

public class Celsius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit temperature:");

        int fahrenheit = sc.nextInt();
        double celsius = 5.0 * (fahrenheit - 32) / 9; // Using 5.0 to ensure floating-point division

        System.out.printf("Celsius temperature is %.2f", celsius); // Print with two decimal places
        sc.close();
    }
}

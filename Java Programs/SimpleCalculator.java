import java.io.*;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String args[]) {
        int n, m;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers n , m");
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println("Choose '+','-','*','/'");
        operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Sum of two numbers:" + (n + m));

                break;
            case '-':
                System.out.println("Subraction:" + (n - m));
                break;
            case '*':
                System.out.println("Multilpication :" + (n * m));
                break;
            case '/':
                if (m == 0) {
                    System.out.println("Division is not possible");
                } else {
                    System.out.println("Division of two numbers is :" + (n / m));
                }
                break;

            default:
                System.out.println("Choose a valid symbol");
                break;
        }
    }

}

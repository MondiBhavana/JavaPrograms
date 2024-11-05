import java.io.*;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[]) {
        int n, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n + "Not a prime number");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0)
                    flag = 1;
                break;
            }

        }
        if (flag == 0) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " not a prime number");
        }
    }
}
import java.io.*;
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Prime Numbers between 1 and N are :");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(" ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            System.out.print("Not a prime number");
            return false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0)
                    return false;
                break;
            }
        }
        return true;
    }
}
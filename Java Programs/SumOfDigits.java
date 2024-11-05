import java.io.*;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        int num;
        int m, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        num = sc.nextInt();
        while (num != 0) {
            m = num % 10;
            sum = sum + m;
            num = num / 10;

        }
        System.out.println("Sum of digits is :" + sum);
    }

}

import java.io.*;
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        int sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        temp = n;
        while (n > 0) {
            int m = n % 10;
            sum = sum * 10 + m;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp + "  is a palindrome series");
        } else {
            System.out.println(temp + "  is not a palindrome ");
        }
    }

}

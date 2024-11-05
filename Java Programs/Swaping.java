
// Java program for swapping of two numbers
import java.io.*;
import java.util.Scanner;

public class Swaping {

    public static void main(String args[]) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        m = sc.nextInt();
        System.out.println("Enter second number");
        n = sc.nextInt();
        swapping(m, n);
    }

    static void swapping(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("First number is " + m);
        System.out.println("Second number is " + n);
    }

}
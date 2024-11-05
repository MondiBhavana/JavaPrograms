import java.io.*;
import java.util.Scanner;

public class FibanocciSeries {
    public static void main(String args[]) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements");
        int n = sc.nextInt();
        System.out.println("Enter first number:");
        int x = sc.nextInt();
        System.out.println("Enter second number:");
        int y = sc.nextInt();
        System.out.print("Fibanocci series is :" + x + y);
        while (count < n) {
            int z = x + y;
            System.out.print(z);
            x = y;
            y = z;
            count++;

        }

    }

}

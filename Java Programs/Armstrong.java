import java.util.Scanner;
import java.io.*;

public class Armstrong {
    public static void main(String args[]) {
        int temp, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        temp = n;
        while (n != 0) {
            int m = n % 10;
            sum = sum + (m * m * m);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " Number is an armstrong number");
        } else {
            System.out.println(temp + " Number is not an armsrong number");
        }

    }

}

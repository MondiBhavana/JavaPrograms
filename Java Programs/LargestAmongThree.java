import java.io.*;
import java.util.Scanner;

public class LargestAmongThree {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String result = (a > b & a > c) ? "a is largest" : (b > a & b > c) ? "b is largest" : "C is largest";
        System.out.println(result);
        sc.close();
    }

}

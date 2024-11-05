import java.io.*;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]) {

        float p, r, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        p = sc.nextFloat();
        System.out.println("Enter no.of years");
        t = sc.nextFloat();
        System.out.println("Enter rate of interest per annum");
        r = sc.nextFloat();

        float si = (p * t * r) / 100;

        System.out.print("Simple interest is :" + si);
        sc.close();
    }

}

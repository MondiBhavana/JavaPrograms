import java.io.*;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String args[]) {
        float p, r, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount");
        p = sc.nextFloat();
        System.out.println("Enter time compounded annualy");
        t = sc.nextFloat();
        System.out.println("Enter rate of interest compounded anually");
        r = sc.nextFloat();
        double ci = p. * Math.pow((1 + r / 100), t);
        System.out.println("Compound interest is :" + ci);
    }

}

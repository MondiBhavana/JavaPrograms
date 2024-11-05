import java.io.*;
import java.util.Scanner;

public class LCM {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("LCM of two numbers " + LCM_n(n, m));
        System.out.print("GCD of two numbers " + GCD(n, m));

    }

    static int GCD(int n, int m) {
        if (n == 0)
            return m;
        return GCD(m % n, n);

    }

    static int LCM_n(int n, int m) {
        return (n / GCD(n, m)) * m;

    }

}

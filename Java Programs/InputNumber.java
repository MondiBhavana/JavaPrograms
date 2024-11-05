
//Java Program to Read The Number From Standard Input
import java.io.*;
import java.util.Scanner;

public class InputNumber {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println("You entered" + num);
        sc.close();

    }
}
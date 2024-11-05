import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println(num + (num % 2 == 0 ? " is an Even number" : " is an Odd number"));

        sc.close();
    }
}

// Java Program to Add Two Binary Strings

import java.io.*;

public class BinaryString {

    static String add_binary(String x, String y) {
        int num = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        int sum = num + num2;
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public static void main(String args[]) {
        String x = "10001", y = "00101";
        System.out.print(add_binary(x, y));
    }

}

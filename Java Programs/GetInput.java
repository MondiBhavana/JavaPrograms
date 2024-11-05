// Java Program to Get Input from the User

import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetInput {
    public static void main(String args[]) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();

        System.out.println(name);

    }

}

package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
    public static void main(String[]args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter something : ");
        String s = br.readLine();
        System.out.println("you entered : " + s);
    }
}

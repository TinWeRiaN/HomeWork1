package Calc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Inpute x");
        int x = Integer.parseInt(br.readLine());

        System.out.println("Inpute y");
        int y = Integer.parseInt(br.readLine());


        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x/y = " + (((double)x)/y));
    }
}

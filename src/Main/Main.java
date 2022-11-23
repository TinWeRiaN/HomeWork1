package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 //       System.out.println("Hello. What is your name?");
 //       String name = br.readLine();
//        System.out.println("How old are you?");
//        int age = Integer.parseInt(br.readLine());

        System.out.println("Inpute x");
        int x = Integer.parseInt(br.readLine());

        System.out.println("Inpute y");
        int y = Integer.parseInt(br.readLine());

 //       System.out.println("Hello " + name);
 //       System.out.println("You are " + age);

        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x/y = " + (((double)x)/y));
    }
}

import java.util.Scanner;

public class pin

{

    public static void main(String[] args) {

        System.out.println("Hello, enter your pin:");

        int pin = 2137;
        int i = 0;

        Scanner scan = new Scanner(System.in);


        while (i < 3) {
            int outpin = scan.nextInt();
            if (outpin != pin) {
                System.out.println("Wrong pin, try again.");
                i++;
            } else
                System.out.println("Success!");

        }

    }

}
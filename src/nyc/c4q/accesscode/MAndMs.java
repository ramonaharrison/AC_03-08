package nyc.c4q.accesscode;

/**
 * Created by mona on 3/8/15.
 */

import java.util.Scanner;

public class MAndMs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mMs = 100;
        int eaten;

        while (mMs > 0) {
            System.out.println(mMs + " M&Ms left\neat how many?");
            eaten = input.nextInt();
 // with if else statements with a desired response, put the desired response below the if
            if (eaten > mMs)
                System.out.println("You don't have that many M&M's.");
            else
                mMs -= eaten;
        }

        System.out.println("you ate all the M&Ms");
    }
}

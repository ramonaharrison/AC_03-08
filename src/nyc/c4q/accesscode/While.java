package nyc.c4q.accesscode;

/**
 * Created by mona on 3/8/15.
 */
import java.util.Scanner;

public class While {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        int x = 10;
        while (x < 100) {
            System.out.println("The number is " + x);
            System.out.println("What's another number?");
            x = scanner.nextInt();
        }
    }
}

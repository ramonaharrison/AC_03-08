package nyc.c4q.accesscode;

/**
 * Created by mona on 3/8/15.
 */
import java.util.Scanner;
public class ExitTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What should I do next?");
            String doNext = input.nextLine();
            if (doNext.equals("quit") || doNext.equals("exit"))
                break;
        }
    }
}

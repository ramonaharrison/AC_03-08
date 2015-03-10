package nyc.c4q.accesscode;

/**
 * Created by mona on 3/8/15.
 */

import java.util.Scanner;

public class WeekdayOrWeekend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's the weekday today?");
        String weekday = input.next();

        if (weekday.equalsIgnoreCase("saturday") || weekday.equalsIgnoreCase("sunday"))
            System.out.println("It's the weekend.");
        else
            System.out.println("It's a weekday");
    }
}

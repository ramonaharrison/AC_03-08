package nyc.c4q.accesscode;

/**
 * Access Code 2.1
 * Ramona Harrison
 * ReadsEmoticon.java
 * This class responds to a user's emoticon input
 */

import java.util.Scanner;

public class ReadsEmoticon {
    public static void main(String[] args) {
        String emotion;
        Scanner input = new Scanner(System.in);

        System.out.println("How do you feel? Type :) or :( or :|");
        emotion = input.nextLine();
        if (emotion.equals(":)"))
            emotion = "happy";
        else if (emotion.equals(":("))
            emotion = "sad";
        else if (emotion.equals(":|"))
            emotion = "plain";
        else
            emotion = "???";

            System.out.println("Today you're " + emotion);

    }
}

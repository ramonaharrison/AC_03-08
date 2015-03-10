package nyc.c4q.accesscode;

/**
 * Created by mona on 3/8/15.
 */

import java.util.Scanner;
import java.util.Random;


public class KeepGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        int guess;
        boolean tooHigh, close;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");


        while (true) {
            System.out.println("Your guess: ");
            guess = input.nextInt();
            if (guess >= 10)
                System.out.println("You guessed a number greater than 10");
            else { // this section determines if the number is close, and if its too high or low

                if (guess == number)
                    break;
                else {
                    if (guess > number)
                        tooHigh = true;
                    else
                        tooHigh = false;

                    if (Math.abs(number - guess) <= 2)
                        close = true;
                    else
                        close = false;
                }

                if (tooHigh && close)
                    System.out.println("You're close! Your guess is too high!");
                else if (tooHigh && !close)
                    System.out.println("You're way off! Your guess is too high!");
                else if (!tooHigh && close)
                    System.out.println("You're close! Your guess is too low!");
                else if (!tooHigh && !close)
                    System.out.println("You're way off! Your guess is too low!");


            }
        }

            System.out.println("That's right! You're a good guesser.");

        }
    }


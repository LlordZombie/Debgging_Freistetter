package oncebadcode.advanced;

import java.util.Scanner;

public class Game {


    public static void main(String[] args) {

        System.out.println("I am ready to play!");
        Scanner input = new Scanner(System.in);
        System.out.println("What's your age?");
        int age;
        while (true) {
            try {
                age = Integer.parseInt(input.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number");
            }
        }
        if (age < 13) {
            System.out.println("You are allowed to play at your own risk");
        } else System.out.println("Play On!");
        System.out.println("You are at an Iggy concert, and you hear this lyric 'Are you ready?, start running.'");
        System.out.println("Suddenly, Iggy stops and says, 'Who wants to race me at running?'");
        System.out.println("Do you want to race Iggy on stage?");
        String userinput = input.nextLine();

        if (userinput.equalsIgnoreCase("yes")) {
            System.out.println("You and Iggy start racing. It's neck and neck! You win by a shoelace!");
            System.out.println("Iggy shakes your hand and says 'Thank you! You should race again at the next concert!'");
        } else {
            System.out.println("Oh no! Iggy shakes his head and sings 'I set a pace, so I can race without pacing.'");
        }
        System.out.println("Rate your game out of 10: ");
        int feedback;
        while (true) {
            try {
                feedback = Integer.parseInt(input.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number");
            }
        }
        if (feedback < 8) {
            System.out.println("I'll keep practicing coding and racing.");
        } else {
            System.out.println("I'm glad you enjoyed the game!");
        }
    }

}

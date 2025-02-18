package NumberGuessingGame;

import java.util.Scanner;

/*
1. Generate Random number.
2. If else for the condition.
3. While-loop to make the game continuous before number is guessed
4. Make with the functions and start the game.
 */
public class NumberGuessingGame {
    public static int generateRandomNumber() {
        return (int) (Math.random() * 101);
    }

    public static void gameConditions(int computerGuess, int playerGuess) {
        if (playerGuess > computerGuess) {
            System.out.println("Think of lower number!");
        } else {
            System.out.println("Think of higher number!");
        }
    }

    public static void startTheGame() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Computer has guessed the number!");
            int computerGuess = generateRandomNumber();

            System.out.println("Now it's your turn to guess the number!");
            while (true) {
                System.out.print("-> ");
                int playerGuess = sc.nextInt();

                if (playerGuess == computerGuess) {
                    System.out.println("Congratulations! You have guessed the correct number\n" +
                            "Computer guessed: " + computerGuess + " \n" +
                            "Player guessed: " + playerGuess);
                    break;
                } else {
                    gameConditions(computerGuess, playerGuess);
                    System.out.println("Try again!");
                }
            }
            System.out.print("Do you wanted to play the game again (Y/N)? \n" +
                    "Ans: ");
            String action = sc.next().toLowerCase();
            if(action.equals("n")){
                System.out.println("Thanks for playing!\n" +
                        "GAME OVER!");
                break;
            } else {
                System.out.println("Welcome back to the game again!");
            }
        }
    }

    public static void main(String[] args) {
        startTheGame();
    }
}

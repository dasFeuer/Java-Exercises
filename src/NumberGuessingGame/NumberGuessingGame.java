package NumberGuessingGame;

import java.util.Scanner;

/*
1. Generate Random number.
2. If else for the condition.
3. While-loop to make the game continuous before number is guessed
4. Make with the functions and start the game.
5. What's new: Add the attempts/guesses with total guesses
6. Player only have 10 guesses to complete the game.
7. Then start the game.
 */
public class NumberGuessingGame {
    public static Scanner sc = new Scanner(System.in);

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

        while (true) {
            int attempts = 0;
            int playerGuess = 0;
            int totalAttempts = 10;

            System.out.println("You have total 10 attempts to complete this game!\n");
            System.out.println("Computer has guessed the number!\n");


            int computerGuess = generateRandomNumber();
            System.out.println("Now it's your turn to guess the number!");
            while (playerGuess != computerGuess) {
                System.out.print("-> ");
                playerGuess = sc.nextInt();
                attempts++;

                if (playerGuess == computerGuess) {
                    System.out.println("Congratulations! You have guessed the correct number in " + attempts + " attempts\n" +
                            "Computer guessed: " + computerGuess + " \n" +
                            "Player guessed: " + playerGuess);
                    break;
                } else {
                    System.out.print("Attempt: " + attempts + "\n" +
                            "NICE TRY!\n");

                    if(attempts == totalAttempts){
                        System.out.println("Your total " + attempts + " attempts has been over! \n" +
                                "BETTER LUCK NEXT TIME!\n");
                        break;
                    }
                    System.out.println();
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
                System.out.println("Welcome back to the game again!\n");
            }
        }
    }

    public static void main(String[] args) {
        startTheGame();
    }
}

import java.util.Scanner;

public class GuessingGame {
    public GuessingGame(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Tell me your name: ");
        String playerName = scan.nextLine();

        int numberToGuess = this.pickRandomNumber();
        int playerGuesses = 0;
        boolean playerGuessedIncorrectly = true;
        while(playerGuessedIncorrectly){
            System.out.println(playerName + ", please guess a number between 1 and 100:");
            int playerGuess = scan.nextInt();

            if(playerGuess > numberToGuess){
                System.out.println("Your guess is too high. Try again.");
            } else if(playerGuess < numberToGuess){
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Great guess! You guessed the number in " + playerGuesses + " tries!");
                playerGuessedIncorrectly = false;
            }
            playerGuesses++;
        }

    }
    //randomly generates an integer between 1 and 100
    private int pickRandomNumber(){
        int randomNumber = 1 + (int)(Math.random() * 100);
        return randomNumber;
    }
}

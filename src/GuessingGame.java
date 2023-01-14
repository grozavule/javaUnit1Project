import java.util.Scanner;

public class GuessingGame {
    public GuessingGame(){
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Tell me your name: ");
        String playerName = Mars.scan.nextLine();

        int numberToGuess = this.pickRandomNumber();
        int playerGuesses = 0;
        boolean playerGuessedIncorrectly = true;
        while(playerGuessedIncorrectly){
            try {
                System.out.println(playerName + ", please guess a number between 1 and 100:");
                int playerGuess = Integer.parseInt(Mars.scan.nextLine());
                playerGuesses++;
                if(playerGuess > 100 || playerGuess < 1){
                    //Robert, I thought you'd find this particularly ironic. ;)
                    System.out.println("What a lousy guess! Next time, try reading the instructions thoroughly before wasting your time!");
                } else if (playerGuess > numberToGuess){
                    System.out.println("Your guess is too high. Try again.");
                } else if(playerGuess < numberToGuess){
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Great guess! You guessed the number in " + playerGuesses + " tries!");
                    playerGuessedIncorrectly = false;
                }
            } catch(NumberFormatException e){
                System.out.println("Imbecile! Don't you understand the rules of the game? Enter a WHOLE NUMBER between 1 and 100");
                playerGuesses++;
                continue;
            }
        }
    }
    //randomly generates an integer between 1 and 100
    private int pickRandomNumber(){
        int randomNumber = 1 + (int)(Math.random() * 100);
        return randomNumber;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        // Game objects
        Scanner scanner = new Scanner(System.in);

        // Welcome
        System.out.println("Welcome to Hangman by Sanjay G Nair!");

        // Game loop
        boolean run = true;
        while (run) {
            gameLoop(scanner);
        }

        scanner.close();
    }
    public static void gameLoop(Scanner scanner) {
        // Game objects
        Display display = new Display();
        ChooseWord chooseWord = new ChooseWord();
        UserInput userInput = new UserInput();
        CheckGuess CheckGuess = new CheckGuess();

        // Game variables 
        String[] revealedLetters = {};
        int lifes = 6;

        // Generates random word
        String word = chooseWord.generateWord();

        boolean gameActive = true;
        while (gameActive) {
            // Hides word and then displays hidden word
            System.out.println(display.hideUnrevealedlLetters(word, revealedLetters));

            // Displays hangman life
            System.out.println(display.lifeDisplay(lifes));

            // Displays revealed letters
            System.out.println(display.revealedLetters(revealedLetters));

            // Takes user guess
            String userGuess = userInput.guess(scanner);

            // Check whether guess is correct and if it is then add revealed letters to blank
            revealedLetters = CheckGuess.returnRevealedLetters(userGuess, word, revealedLetters);

            // Check whether guess is correct and if it is not then reduce life
            lifes = CheckGuess.checkLetter(lifes, userGuess, word);

            // Check whether user won the game
            if (lifes > 0) {
                if (CheckGuess.checkWinnner(lifes, word, revealedLetters)) {
                    System.out.println(display.hideUnrevealedlLetters(word, revealedLetters));
                    System.out.println(display.lifeDisplay(lifes));
                    System.out.println(display.revealedLetters(revealedLetters));

                    System.out.println("You won! The word was " + word + ".");
                    System.out.println("");
                    gameActive = false;
                }
            } else if (lifes == 0) {
                System.out.println(display.hideUnrevealedlLetters(word, revealedLetters));
                System.out.println(display.lifeDisplay(lifes));
                System.out.println(display.revealedLetters(revealedLetters));
                
                System.out.println("You lost! The word was " + word + ".");
                System.out.println("");
                gameActive = false;
            }
        }
    }
}
import java.util.Scanner;

public class UserInput {
    public String guess(Scanner scanner) {
        // Takes user input and returns it as a string
        System.out.print("<Guess a letter> ");
        String userGuess = scanner.nextLine();
        
        return userGuess;
    }
}
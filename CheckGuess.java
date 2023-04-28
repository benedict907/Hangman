import java.util.HashSet;

public class CheckGuess {
    public HashSet<String> returnGuessedLetters(String guess, String word, HashSet<String> guessedLetters) {
        // Checks whether guess is correct and then returns revealed letters
        if (word.contains(guess)) {
            guessedLetters.add(guess);
        } else {
            guessedLetters.add(guess);
        }
        return guessedLetters;
    }
    public int checkLetter(int lifes, String guess, String word) {
        // Checks whether guess is correct and if it is not then it reduces user's life
        if (!word.contains(guess)) {
            lifes--;
            return lifes;
        } else {
            return lifes;
        }
    }
    public boolean checkWinnner(int lifes, String word, String[] revealedLetters) {
        // checks whether the user has won the game or not and then returns a boolean
        if (lifes > 0) {
            int letterCount = 0;
            for (String n : revealedLetters) {
                if (word.contains(n.toString())) {
                    letterCount++;
                    break;
                }
            }
            if (letterCount == word.length()) {
                return true;
            }
        }
        return false;    
    }
}

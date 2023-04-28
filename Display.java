import java.util.HashSet;
import java.util.Iterator;

public class Display {
    public String hideUnrevealedlLetters(String word, HashSet<String> guessedLetters) {
        // Replaces each letter with an underscore if not revealed and then returns the string
        Iterator<String> iterator = guessedLetters.iterator();
        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++) {
            String temp = "_ ";
            while (iterator.hasNext()) {
                if (String.valueOf(word.charAt(i)).equals(iterator.next())) {
                    temp = iterator.next() + " ";
                }
            }
            hiddenWord += temp;
        }
        
        return hiddenWord;
    }
    public String lifeDisplay(int lifes) {
        // Returns a string with the life display
        String lifeDisplayString = "";
        switch (lifes) {
            case 6:
                lifeDisplayString = """
                     ___
                    |   |
                        |
                        |
                        |
                  ______|
                        """;
                break;
            case 5:
                lifeDisplayString = """
                     ___
                    |   |
                   ( )  |
                        |
                        |
                  ______|
                        """;
                break;
            case 4:
                lifeDisplayString = """
                     ___
                    |   |
                   ( )  |
                    |   |
                        |
                  ______|
                        """;
                break;
            case 3:
                lifeDisplayString = """
                     ___
                    |   |
                   ( )  |
                   /|   |
                        |
                  ______|
                        """;
                break;
            case 2:
                lifeDisplayString = """
                     ___
                    |   |
                   ( )  |
                   /|\\  |
                        |
                  ______|
                        """;
                break;
            case 1:
                lifeDisplayString = """
                     ___
                    |   |
                   ( )  |
                   /|\\  |
                   /    |
                  ______|
                        """;
                break;
            case 0:
                lifeDisplayString = """
                     ___
                    |   |
                   ( )  |
                   /|\\  |
                   / \\  |
                  ______|
                        """;
                break;
        }

        return lifeDisplayString;
    }
    public String guessedLetters(HashSet<String> guessedLettersArray) {
        // Returns revealed letters
        Iterator<String> iterator = guessedLettersArray.iterator();
        String guessedLettersString = "Guessed Letters: ";
        // for (String i : guessedLettersArray) {
        //     guessedLettersString += i + " ";
        // }

        while (iterator.hasNext()) {
            guessedLettersString += iterator.next() + " ";
        }

        return guessedLettersString;
    }
}
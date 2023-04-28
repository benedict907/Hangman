public class Display {
    public String hideUnrevealedlLetters(String word, String[] revealedLetters) {
        // Replaces each letter with an underscore if not revealed and then returns the string
        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++) {
            String temp = "_ ";
            for (String n : revealedLetters) {
                if (String.valueOf(word.charAt(i)).equals(n)) {
                    temp = n + " ";
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
    public String revealedLetters(String[] revealedLettersArray) {
        // Returns revealed letters
        String revealedLettersString = "Revealed Letters: ";
        for (String i : revealedLettersArray) {
            revealedLettersString += i + " ";
        }

        return revealedLettersString;
    }
}
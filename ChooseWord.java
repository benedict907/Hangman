import java.util.Random;

public class ChooseWord {
    public String generateWord(){
        // Chooses random word from a set list of words and then returns it
        Random random = new Random();
        String wordString = "sofa researcher return error snap he camp provincial opposite piano publicity fair perforate corpse disagree trunk park precede proof incredible venture cry quarter modest oh abnormal choose season east dismissal land enter refrigerator pan treaty favorable revolution industry sculpture litigation overcharge track transmission federation bang lighter discrimination few section pit";
        String[] wordArray = wordString.split(" ");
        int randomIndex = random.nextInt(wordArray.length);
        
        return wordArray[randomIndex];
    }
}
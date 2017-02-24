/**
 * Created by magonye on 24/2/17.
 */
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SpinWords {
    public String spinWords(String sentence) {
        return Pattern.compile(" +").splitAsStream(sentence)
                .map(word->word.length()<5?word:new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

}

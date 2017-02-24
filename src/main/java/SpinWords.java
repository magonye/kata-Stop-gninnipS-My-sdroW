/**
 * Created by magonye on 24/2/17.
 */
public class SpinWords {
    public String spinWords(String welcome) {
        if (welcome.length()>=5){
            return new StringBuilder(welcome).reverse().toString();
        } else {
            return welcome;
        }
    }

}

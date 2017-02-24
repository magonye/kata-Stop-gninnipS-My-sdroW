/**
 * Created by magonye on 24/2/17.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpinWordsShould {

    @Test public void
    return_a_word_without_reversing_when_less_than_five_letters() {
        assertEquals("one",new SpinWords().spinWords("one"));
    }

    @Test public void
    return_a_word_reversed_when_more_than_five_letters(){
        assertEquals("awesome",new SpinWords().spinWords("emosewa"));
    }

    //@Test
    //public void test() {
    ///    assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
    //    assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    //}

}

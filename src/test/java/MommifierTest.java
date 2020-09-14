import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MommifierTest {

    @Test
    public void should_return_words_itself_when_convert_given_string_is_null_or_empty(){
        VowelConverter vc=new VowelConverter();
        String str=null;
        String str1="";
        String nullString=vc.covert(str);
        String emptyString=vc.covert(str1);
        assertEquals(str, nullString);
        assertEquals(str1, emptyString);
    }

    @Test
    public void should_return_words_itself_when_covert_given_a_string_less_than_30_precent_vowels(){
        VowelConverter vc=new VowelConverter();
        String str = "afefif";
        String result = vc.covert(str);
        assertEquals(str, result);
    }

    @Test
    public void should_return_words_itself_when_covert_given_a_string_with_more_than_30_precent_discontinuous_vowels() {
        VowelConverter vc = new VowelConverter();
        String moreThanResult = vc.covert("ikfihof");
        assertEquals("ikfihof", moreThanResult);
    }

}

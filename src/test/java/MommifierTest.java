import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MommifierTest {

    @Test
    public void should_return_words_itself_when_convert_given_string_is_null_or_empty(){
        VowelConverter vc=new VowelConverter();
        String str=null;
        String str1="";
        String nullString=vc.convert(str);
        String emptyString=vc.convert(str1);
        assertEquals(nullString, str);
        assertEquals(emptyString, str1);
    }


}

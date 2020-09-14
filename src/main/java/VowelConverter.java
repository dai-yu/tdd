import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelConverter {
    private static final String CONTINUOUS_VOWELS = "[aeiouAEIOU]{2,}";
    private static final String MOMMY = "mommy";

    public String covert(String str) {
        if(str==null || str==""){
            return str;
        }

        String copyString = str;
        copyString = copyString.replaceAll("[aeiouAEIOU]", "");
        int vowelsCount = str.length() - copyString.length();
        double vowelsProportion = (float)vowelsCount / str.length();

        return vowelsProportion>0.3?str:str;
    }

}

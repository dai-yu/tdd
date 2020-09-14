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
        if(vowelsProportion >0.3) {
            Pattern pattern = Pattern.compile(CONTINUOUS_VOWELS);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                str = str.replaceAll(matcher.group(), String.join(MOMMY, matcher.group().split("")));
            }
        }
        return str;
    }

}

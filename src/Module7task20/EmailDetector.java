package Module7task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDetector {
    public boolean isPresent(String text) {
        boolean result=false;
        String regex = "[a-z][a-z]@[a-z][a-z]";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) result = true;
        System.out.println(matcher);
        int dogCharIndex = text.indexOf("@");
        System.out.println("Dog index - "+dogCharIndex);
        return result;
    }
}
class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}

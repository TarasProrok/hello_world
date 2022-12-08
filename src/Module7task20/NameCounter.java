package Module7task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameCounter {
    public int count(String text) {
        String [] words = text.split(" ");
        int nameCounter = 0;
        for (int i = 0; i < words.length; i++) {
            String regex1 = "^[A-Z][a-z]";
            Pattern pattern1 = Pattern.compile(regex1);
            Matcher matcher1 = pattern1.matcher(words[i]);
                if ((words[i].length() >= 2) && (matcher1.find())) {// && (matcher2.find(1))) {
                    System.out.println(matcher1);
                    nameCounter++;
                    System.out.println(words[i]);
                }
            }
        System.out.println(nameCounter);
        return nameCounter;
    }
}
class NameCounterTest {
    public static void main(String[] args) {
        //1
//        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
 //       System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
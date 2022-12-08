package prevModules;

public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        String lowerPhrase = phrase.toLowerCase();
        boolean phraseContains = ((lowerPhrase.contains("pass")) || (lowerPhrase.contains("key")) ||
                (lowerPhrase.contains("login")) || (lowerPhrase.contains("email")));
                return phraseContains;
    }
}
class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}

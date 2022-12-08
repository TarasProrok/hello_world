package prevModules;

public class ShortWordCounter {
    public int count(String phrase, int minLength) {
        int wordCount = 0;
        String[] words = phrase.split(" ");
        System.out.println("Words - "+words.length);
        String tempWord = "";
        for (int i = 0; i < words.length; i++) {
            tempWord = words[i];
            int tempWordLength = tempWord.length();
            if (tempWordLength <= minLength) {
                wordCount++;
            }
            System.out.println(wordCount);
        }
        return wordCount;
    }
}
class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}

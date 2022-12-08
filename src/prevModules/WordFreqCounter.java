package prevModules;

public class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        float wordCount = 0.0F;
        String[] words = phrase.split("\\s+");
        System.out.println(words.length);

        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(word)) {
                wordCount++;
            }
            System.out.println(wordCount);
        }
        return wordCount/words.length;
    }
}
class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
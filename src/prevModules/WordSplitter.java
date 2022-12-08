package prevModules;

import java.util.Arrays;
class WordSplitter {
    public String[] split(String phrase) {
        String phrase2 = phrase.toLowerCase();
        String[] strings = phrase2.split("\\s+", 0);
        return strings;
    }
}
class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
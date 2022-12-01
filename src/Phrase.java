import java.util.Arrays;
class Phrase {
    private final String[] words;
    private final String[] moreWords;
    public Phrase(String[] words) {
        this.words = words;
        this.moreWords = Arrays.copyOf(words, words.length);;
    }
    @Override
    public String toString() {
        String list = "";
        int i = 0;
        while (i < moreWords.length) {
            list += moreWords[i];
            i++;
            list += " ";
        }
        return list;
    }
}


class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
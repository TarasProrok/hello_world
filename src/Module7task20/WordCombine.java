package Module7task20;

import java.util.Arrays;

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        String temp = sourceWord;
        sourceWord = targetWord.toLowerCase();
        targetWord = temp.toLowerCase();
        System.out.println(sourceWord+" -- "+targetWord);
        char[] word1Chars = sourceWord.toCharArray();
        char[] word2Chars = targetWord.toCharArray();
        int i = 0, j = 0;
        String duplicates = "";
        int counter = 0;
        while (i < word1Chars.length && j < word2Chars.length) {
            if (word1Chars[i] == word2Chars[j]) {
                duplicates += word1Chars[i];
                counter++;
                i++;
                j=0;
            }
            else j++;
        }
        boolean result = counter == word1Chars.length;
        System.out.println(counter);
        System.out.println(duplicates);
        return result;
    }
}
class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

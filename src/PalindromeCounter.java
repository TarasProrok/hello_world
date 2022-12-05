public class PalindromeCounter {
    public int count(String phrase) {
        String lowerPhrase = phrase.toLowerCase();
        String[] words = lowerPhrase.split("\\s");
        System.out.println("Words - "+words.length);
        int palindromes = 0;
        for (int i = 0; i < words.length; ) {
            System.out.println("Word no "+(i+1)+" - "+words[i]);
            String word1 = words[i];
            char [] wordChars = word1.toCharArray();
            char ch1 = word1.charAt(0);
            char ch2 = word1.charAt(word1.length()-1);
            char ch3 = word1.charAt(1);
            char ch4 = word1.charAt(word1.length()-2);
            System.out.println("First char - "+wordChars[0]+", last char - "+wordChars[wordChars.length-1]);
                    if ((ch1==ch2) && (ch3==ch4)) {
                        palindromes++;
                        System.out.println("Palindromes - "+palindromes);
                    }
                    i++;
                }
            System.out.println("All Palindromes - "+palindromes);
        return palindromes;
        }
    }
class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

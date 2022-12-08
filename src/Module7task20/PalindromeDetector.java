package Module7task20;

public class PalindromeDetector {
        public boolean isPalindrome(String word) {
            return word.equalsIgnoreCase(reverse(word));
        }

        private String reverse(String word) {
            StringBuilder str = new StringBuilder(word);
            StringBuilder reverseStr = str.reverse();
            return reverseStr.toString();
        }
    }

    class PalindromeDetectorTest {
        public static void main(String[] args) {
            //false
            System.out.println(new PalindromeDetector().isPalindrome("Java"));

            //true
            System.out.println(new PalindromeDetector().isPalindrome("Noon"));
        }
    }

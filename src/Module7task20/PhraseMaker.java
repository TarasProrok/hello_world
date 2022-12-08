package Module7task20;

public class PhraseMaker {
        public String join(String[] words) {
            for(int j = 0; j < words.length; j++) {
                String word = words[j];
                if (word.length() <= 3) {
                    word = word.toUpperCase();
                } else { word = word.toLowerCase(); }
                if (j != words.length - 1) word = word.concat(" ");
                words[j] = word;
            }
            StringBuilder sb = new StringBuilder();
            for (String i : words)
                sb.append(i);
            String str = sb.toString();
            return str;
        }
    }

    class PhraseMakerTest {
        public static void main(String[] args) {
            String[] words = {"Life", "is", "great", "thing"};

            //life IS great thing
            System.out.println(new PhraseMaker().join(words));
        }
    }

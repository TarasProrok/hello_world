package prevModules;

public class WordDeleter {
    public String remove(String phrase, String[] words) {
        String newPhrase = "";
        for (int i = 0; i < words.length;i++) {
            System.out.println("prevModules.Phrase - "+phrase);
        String[] badWords = phrase.split(" ");
            for (String wordss : badWords) {
                if (!wordss.equals(words[i])) {
                        newPhrase += wordss + " ";
                    }
                }
            phrase = newPhrase;
            System.out.println(newPhrase);
            System.out.println("-----");
            newPhrase = "";

        }
        return phrase.trim();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("ibfe evrudejy zyryzai egces zime", new String[] {"egces", "zime", "ibfe"}));

        //This Sparta
      //  System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
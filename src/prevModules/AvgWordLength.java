package prevModules;

public class AvgWordLength {
    public double count(String phrase) {
        float letters = 0.0f;
        float avgLength;
            String[] badWords = phrase.split(" ");
            for (String wordss : badWords) {
                letters += wordss.length();
        }
            avgLength = letters/ badWords.length;
        return avgLength;
    }
}
class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
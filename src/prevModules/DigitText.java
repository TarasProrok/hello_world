package prevModules;

public class DigitText {
    public boolean detect(String text) {
        boolean phraseContainsDigit = (
                (text.contains("a")) ||
                (text.contains("b")) ||
                (text.contains("c")) ||
                (text.contains("d")) ||
                (text.contains("e")) ||
                (text.contains("f")) ||
                (text.contains("g")) ||
                (text.contains("h")) ||
                (text.contains("i")) ||
                (text.contains("j")) ||
                (text.contains("k")) ||
                (text.contains("l")) ||
                (text.contains("m")) ||
                (text.contains("n")) ||
                (text.contains("o")) ||
                (text.contains("p")) ||
                (text.contains("q")) ||
                (text.contains("r")) ||
                (text.contains("s")) ||
                (text.contains("t")) ||
                (text.contains("u")) ||
                (text.contains("v")) ||
                (text.contains("w")) ||
                (text.contains("x")) ||
                (text.contains("y")) ||
                (text.contains("z")));
        return !phraseContainsDigit;
    }
}
class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}

public class MathDetector {
    public boolean isMath(String text3) {
        boolean isIt = false;
        int numberOfNumbers = 0;
        for (int i = 0; i < text3.length(); i++) {
            if (Character.isDigit(text3.charAt(i))) {
                numberOfNumbers++;
            }
        }
            if ((numberOfNumbers > 1) &&  (text3.contains("="))) {
                if (text3.contains("+") || text3.contains("-") || text3.contains("*") || text3.contains("/")) {
                    isIt = true;
                }
            }

        return isIt;
    }
}
class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("q+d=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}
package Module7task20;

public class BigOrSmall {
    public String calculate(String text) {
        String result = "";
        int counterBigs = 0;
        int counterSmalls = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) counterBigs++;

            // Check for lowercase letters.
            if (Character.isLowerCase(text.charAt(i))) counterSmalls++;
        }
        if (counterBigs > counterSmalls) result = "Big";
        if (counterBigs < counterSmalls) result = "Small";
        if (counterBigs == counterSmalls) result = "Same";
        return result;
        }
    }
class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

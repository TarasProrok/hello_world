import java.util.Arrays;
public class DigitExtracter {
    public int[] extract(String text4) {
        String digits = "";
        int[] drums;
        for (int i = 0; i < text4.length(); i++) {
            char chrs = text4.charAt(i);
            if (Character.isDigit(chrs))
                digits = digits + chrs;
            System.out.println(digits);
        }
        String[] numbs = (digits.split(""));
        drums = new int[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            drums[i] = Integer.parseInt(numbs[i]);
        }
        return drums;
    }
    }
//        int i = 0;
//        int j = 0;
//        int numberOfNumbers = 0;
//        for (int k = 0; k < text4.length(); k++) {
//            if (Character.isDigit(text4.charAt(k))) {
//                numberOfNumbers++;
//                System.out.println(numberOfNumbers);
//            }
//        }
//        int[] numbersNumbers = new int[numberOfNumbers];
//        for (; i < text4.length(); i++) {
//            for (; j < numbersNumbers.length; j++) {
//                if (Character.isDigit(text4.charAt(i))) {
//                    numbersNumbers[j] = Integer.parseInt(Character.toString(text4.charAt(i)));
//                }
//            }
//        }
//        return numbersNumbers;
//    }
//}
class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int [] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

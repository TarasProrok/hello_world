package prevModules;

public class SummaryCreator {
    public String create(String text2) {
        String newText = "";
        int textLength = text2.length();
            if (textLength <= 15) {
                newText = text2;
            }
            else if (textLength > 15) {
                if ((text2.charAt(15)) != ' ') {
                    newText = text2.substring(0, 15)+"...";
                }
                else if ((text2.charAt(15)) == ' ') {
                newText = text2.substring(0, 15);
            }
        }
            return newText;
            }
    }
class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}

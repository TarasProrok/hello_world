package Module7task20;

import java.util.Arrays;

public class WaterCounter {
    public double count(String text) {
            int totalChars = text.length();
            int spaceCounter = 0;
            double waters = 0;
            String [] spaces = text.split("");
            for (int i = 0; i<spaces.length; ) {
                if (spaces[i].equals(" ")) {
                    spaceCounter++;
                }
                i++;
            }
            waters = (double) spaceCounter/ (double) totalChars;

            return waters;
        }
    }
//        text = text.trim();
//        int totalChars = text.length();
//        int spaceCounter = 0;
//        double waters = 0;
//        String [] spaces = text.split("");
//        System.out.println(Arrays.toString(spaces));
//        for (int i = 0; i<spaces.length; i++) {
//            if (spaces[i].isBlank()) {
//                spaceCounter++;
//            }
//        }
//        waters = (double)spaceCounter/(double)totalChars;
//        System.out.println("Total - "+totalChars+", Spaces - "+spaceCounter+", Water - "+waters);
//        return waters;
//    }
//}
class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
                System.out.println(new WaterCounter().count(" w ev x c d ei "));
    }
}

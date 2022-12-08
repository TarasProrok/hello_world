package prevModules;

import java.util.Arrays;

public class TargetFinder {
    private int[] aiCoords;
    private int[][] targets;

    public int[] getAiCoords() {
        return aiCoords;
    }

    public int[][] getTargets() {
        return targets;
    }

   public int[] findTarget(int[] aiCoords, int[][] targets) {
       int sideA = 0;
       int sideB = 0;
       double distance = 0;
       double minDistance = Double.MAX_VALUE;
       int [] target = new int[2];
       for (int i = 0; i < targets.length; i++) {
           sideA = targets[i][1] - aiCoords[1];
           sideB = targets[i][0] - aiCoords[0];
           distance = (Math.sqrt((sideA * sideA) + (sideB * sideB)));
           System.out.println(Arrays.toString(targets[i]));
           System.out.println("Side A - "+sideA+", Side B - "+sideB+", distance - "+distance);
           if (distance < minDistance) {
               minDistance = distance;
               target[0] = targets[i][0];
               target[1] = targets[i][1];
           };
           }
       return target;
   }
   }

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
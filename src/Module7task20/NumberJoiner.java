package Module7task20;

public class NumberJoiner {
    public String join(int[] numbers) {
//        String result = "";
//        for(int number: numbers) {
//            result += number;
//        }
//        return result;
//    }
//}
        StringBuilder sb = new StringBuilder();
        for (int i : numbers)
            sb.append(i);
        String str = sb.toString();

        return str;
    }
}
class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}
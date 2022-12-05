public class UniqueCharCounter {
    public int count(String phrase) {
        String temp = "";
        int counter =0;
        for (int i = 0; i < phrase.length(); i++){
            if (temp.indexOf(phrase.charAt(i)) == - 1){
                temp = temp + phrase.charAt(i);
                counter++;
            }
        }
        System.out.print("Phrase - "+phrase+", Temp - "+temp + " " +"Unique chars - ");
        return counter;
    }
}
class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}

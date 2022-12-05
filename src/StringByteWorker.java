public class StringByteWorker {
    public String process(byte[] bytes) {
        String test = "";
        for (int i = 0; i < bytes.length; i++) {

            char ch = (char) bytes[i];
            test = test + ch;
            System.out.println(test);
        }
        return (test.toLowerCase());
    }
}
class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}

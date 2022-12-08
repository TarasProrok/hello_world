package Module7task20;

public class ObjectWorker {
    public String join(Object[] objects) {
        StringBuilder sb = new StringBuilder();
        for (Object i : objects)
            sb.append(i).append(" ");
        String str = sb.toString();
        str = str.trim();
        return str;
    }
}
class ObjectWorkerTest {
    public static void main(String[] args) {
        Object[] data = {"Hello", 20L, 3.14f, true};

        //Hello 20 3.14 true
        System.out.println(new ObjectWorker().join(data));
    }
}

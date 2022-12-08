package Module7task20;

public class NameParser {
    public String parse(String[] names) {
        for(int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];
            if (i != names.length - 1) firstName = firstName.concat(", ");
            names[i] = firstName;
        }
        StringBuilder sb = new StringBuilder();
        for (String i : names)
            sb.append(i);
        String str = sb.toString();
        return str;
    }
}
class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}

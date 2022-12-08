package prevModules;

public class DoubleSpaceCleaner {
    public String clean(String phrase) {
        String cleanString = (phrase.replace("  ", " "));
        cleanString = (cleanString.replace("  ", " "));
        cleanString = (cleanString.replace("  ", " "));
        cleanString = (cleanString.replace("  ", " "));
        return cleanString.trim();
    }
}
    class DoubleSpaceCleanerTest {
        public static void main(String[] args) {
            DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

            //Hello World
            System.out.println(cleaner.clean("Hello World"));

            //Hello World
            System.out.println(cleaner.clean("       Hello              World          "));
        }
    }

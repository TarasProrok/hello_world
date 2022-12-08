package prevModules;

public class Levl {
    private int width;
    private int height;
    public int area;
    public Levl(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = width*height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
class LevlLoader {
    public void load(Levl level) throws LevelTooBigException {
        if (level.area > 100000) {
            throw new LevelTooBigException();
        }
        System.out.println("prevModules.Level loaded");
    }
}
class LevelTooBigException extends Exception {
    LevelTooBigException () {
        super("prevModules.Level too big");
    }
}
class LevlLoaderTest {
    public static void main(String[] args) {
        //prevModules.Level loaded
        try {
            new LevlLoader().load(new Levl(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("prevModules.Level too big");
        }

        //prevModules.Level too big
        try {
            new LevlLoader().load(new Levl(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("prevModules.Level too big");
        }
    }
}
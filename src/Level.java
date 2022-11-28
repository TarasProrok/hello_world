public class Level {
    private Point[] points;
    LevelInfo levelInfo;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;

    }

    @Override
    public String toString() {
        return ("Quarke level, name is " + levelInfo.name + ", difficulty is " + levelInfo.difficulty + ", point count is " + points.length);
    }

    static class Point {
        private static int x;
        private static int y;
        private static int myHash;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            myHash = myHash + (Point.x * Point.y);
            System.out.println(myHash);
        }
    }

    int calculateLevelHash() {
        return Point.myHash;
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

    }
}
class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}
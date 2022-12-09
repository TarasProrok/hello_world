package Module8;

class Shape {
    public String toString() {
        return null;
    }
}
    class Circle extends Shape {
    @Override
    public String toString() {
            return "Circle";
        }
    }
    class Triangle extends Shape {
    @Override
        public String toString() {
        return "Triangle";
        }
    }
    class Quad extends Shape {
    @Override
        public String toString () {
        return "Quad";
        }
    }
    class Pentagon extends Shape {
    @Override
        public String toString () {
        return "Pentagon";
        }
    }
    class Hexagon extends Shape {
    @Override
        public String toString () {
        return "Hexagon";
        }
    }
    class Heptagon extends Shape {
    @Override
        public String toString () {
        return "Heptagon";
        }
    }
    class Octagon extends Shape {
    @Override
        public String toString () {
        return "Octagon";
        }
    }
    class Nonagon extends Shape {
    @Override
        public String toString() {
        return "Nonagon";
        }
    }
    class ShapePrinter {
        public static void shapePrinter(Shape shape) {
            System.out.println(shape.toString());
        }
    }
class ShapePrinterTest {
    private static  Circle circle = new Circle();
    private static Triangle triangle = new Triangle();
    private static Quad quad = new Quad();
    private static Pentagon pentagon = new Pentagon();
    private static Hexagon hexagon = new Hexagon();
    private static Heptagon heptagon = new Heptagon();
    private static Octagon octagon = new Octagon();
    private static Nonagon nonagon = new Nonagon();
    public static Circle getCircle() {
        return circle;
    }

    public static Triangle getTriangle() {
        return triangle;
    }

    public static Quad getQuad() {
        return quad;
    }

    public static Pentagon getPentagon() {
        return pentagon;
    }

    public static Hexagon getHexagon() {
        return hexagon;
    }

    public static Heptagon getHeptagon() {
        return heptagon;
    }

    public static Octagon getOctagon() {
        return octagon;
    }

    public static Nonagon getNonagon() {
        return nonagon;
    }
        public static void main(String[] args) {
            ShapePrinter.shapePrinter(getNonagon());
        }
    }
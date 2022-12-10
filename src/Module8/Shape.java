package Module8;

import java.util.Scanner;

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
    private static final Shape circle = new Circle();
    private static final Shape triangle = new Triangle();
    private static final Shape quad = new Quad();
    private static final Shape pentagon = new Pentagon();
    private static final Shape hexagon = new Hexagon();
    private static final Shape heptagon = new Heptagon();
    private static final Shape octagon = new Octagon();
    private static final Shape nonagon = new Nonagon();
    public static Shape getCircle() {
        return circle;
    }

    public static Shape getTriangle() {
        return triangle;
    }

    public static Shape getQuad() {
        return quad;
    }

    public static Shape getPentagon() {
        return pentagon;
    }

    public static Shape getHexagon() {
        return hexagon;
    }

    public static Shape getHeptagon() {
        return heptagon;
    }

    public static Shape getOctagon() {
        return octagon;
    }

    public static Shape getNonagon() {
        return nonagon;
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number of angles from 3 to 9 or 0: ");
            int angles = scanner.nextInt();
            switch (angles) {
                case 0:
                    ShapePrinter.shapePrinter(getCircle());
                    break;
                case 3:
                    ShapePrinter.shapePrinter(getTriangle());
                    break;
                case 4:
                    ShapePrinter.shapePrinter(getQuad());
                    break;
                case 5:
                    ShapePrinter.shapePrinter(getPentagon());
                    break;
                case 6:
                    ShapePrinter.shapePrinter(getHexagon());
                    break;
                case 7:
                    ShapePrinter.shapePrinter(getHeptagon());
                    break;
                case 8:
                    ShapePrinter.shapePrinter(getOctagon());
                    break;
                case 9:
                    ShapePrinter.shapePrinter(getNonagon());
                    break;
                default:
                    System.out.println("No shape defined!");
            }
        }
    }
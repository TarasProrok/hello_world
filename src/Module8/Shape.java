package Module8;

import java.util.Scanner;

class Shape {
    private static Circle circle = new Circle();
    private static Triangle triangle = new Triangle();
    private static Quad quad = new Quad();
    private static Pentagon pentagon = new Pentagon();
    private static Hexagon hexagon = new Hexagon();
    private static Heptagon heptagon = new Heptagon();
    private static Octagon octagon = new Octagon();
    private static Nonagon nonagon = new Nonagon();


    static void printShapeName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of angles from 3 to 9 or 0: ");
        int angles = scanner.nextInt();
        switch (angles) {
            case 0:
                circle.circleShape();
            case 3:
                triangle.triangleShape();
                break;
            case 4:
                quad.quadShape();
                break;
            case 5:
                pentagon.pentagonShape();
                break;
            case 6:
                hexagon.hexagonShape();
                break;
            case 7:
                heptagon.heptagonShape();
                break;
            case 8:
                octagon.octagonShape();
                break;
            case 9:
                nonagon.nonagonShape();
                break;
            default:
                System.out.println("No shape!");
        }
    }
}

 class Circle extends Shape {
     public void circleShape() {
         System.out.println("Circle");
     }
    }
class Triangle extends Shape {
    public void triangleShape() {
        System.out.println("Triangle");
    }
}
class Quad extends Shape {
    public void quadShape() {
        System.out.println("Quad");
    }
}
class Pentagon extends Shape {
    public void pentagonShape() {
        System.out.println("Pentagon");
    }
}
class Hexagon extends Shape {
    public void hexagonShape() {
        System.out.println("Hexagon");
    }
}
class Heptagon extends Shape {
    public void heptagonShape() {
        System.out.println("Heptagon");
    }
}
class Octagon extends Shape {
    public void octagonShape() {
        System.out.println("Octagon");
    }
}
class Nonagon extends Shape {
    public void nonagonShape() {
        System.out.println("Nonagon");
    }
}


class ShapeTest {
    public static void main(String[] args) {
        Shape.printShapeName();
    }
}
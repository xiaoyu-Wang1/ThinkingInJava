package typeinfo;//: typeinfo/Shapes.java

import java.util.*;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();

    abstract public void rotate(Shape shape);
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }

    @Override
    public void rotate(Shape shape) {
        //do nothing
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }

    @Override
    public void rotate(Shape shape) {
        System.out.println("square rotate");
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }

    @Override
    public void rotate(Shape shape) {
        System.out.println("triangle rotate");
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }

    @Override
    public void rotate(Shape shape) {
        System.out.println("rhomboid rotate");
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for (Shape shape : shapeList) {
            shape.draw();
            shape.rotate(shape);
        }

        Rhomboid rhomboid = new Rhomboid();
        Shape shape = (Shape) rhomboid;
        if (shape instanceof Rhomboid) {
            Rhomboid newR = (Rhomboid) shape;
        }

        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
        }
    }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~

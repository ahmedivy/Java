package Exercise13;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        shapes.add(new Circle(5));
        shapes.add(new Square(5));
        shapes.add(new Triangle(8, 3));
        shapes.add(new Sphere(4));
        shapes.add(new Cube(4));
        shapes.add(new Tetrahedron(10));

        for (Shape shape : shapes) {
            System.out.println(shape + ":");
            if (shape instanceof ThreeDimShape) {
                System.out.printf("\tArea: %.2f%n", ((ThreeDimShape) shape).getArea());
                System.out.printf("\tVolume: %.2f%n", ((ThreeDimShape) shape).getVolume());
            } 
            else if (shape instanceof TwoDimShape) {
                System.out.printf("\tArea: %.2f%n", ((TwoDimShape) shape).getArea());
            }
        }
    }
}

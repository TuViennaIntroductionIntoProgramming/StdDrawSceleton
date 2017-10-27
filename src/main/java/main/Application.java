package main;

import edu.princeton.cs.introcs.StdDraw;
import library.shapes.Circle;
import library.shapes.Line;
import library.shapes.Rectangle;
import library.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Rectangle(0.7,0.7,0.1,0.1));
        shapes.add(new Line(0,0,1,1));
        shapes.add(new Circle(0.4,0.4,0.2));

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

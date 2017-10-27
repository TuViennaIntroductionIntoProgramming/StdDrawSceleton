package library.shapes;

import library.StdDrawUtils;

public class Circle implements Shape{
    double x;
    double y;
    double radius;

    public Circle() {
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw()
    {
        StdDrawUtils.drawCircle(x,y,radius);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

package library.shapes;

import edu.princeton.cs.introcs.StdDraw;
import library.StdDrawUtils;

public class Ellipse implements Shape{
    double x;
    double y;
    double semiMajorAxis;
    double semiMinorAxis;

    public Ellipse() {
    }

    public Ellipse(double x, double y, double semiMajorAxis, double semiMinorAxis) {
        this.x = x;
        this.y = y;
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public void draw()
    {
        StdDrawUtils.drawEllipse(x,y,semiMajorAxis,semiMinorAxis);
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

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    public void setSemiMinorAxis(double semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }
}

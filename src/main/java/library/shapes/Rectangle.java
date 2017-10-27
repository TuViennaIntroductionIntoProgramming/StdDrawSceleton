package library.shapes;

import library.StdDrawUtils;

public class Rectangle implements Shape{
    double x;
    double y;
    double halfWidth;
    double halfHeight;

    public Rectangle() {
    }

    public Rectangle(double x, double y, double halfWidth, double halfHeight) {
        this.x = x;
        this.y = y;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
    }

    public void draw()
    {
        StdDrawUtils.drawRectangle(x,y,halfWidth,halfHeight);
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

    public double getHalfWidth() {
        return halfWidth;
    }

    public void setHalfWidth(double halfWidth) {
        this.halfWidth = halfWidth;
    }

    public double getHalfHeight() {
        return halfHeight;
    }

    public void setHalfHeight(double halfHeight) {
        this.halfHeight = halfHeight;
    }
}

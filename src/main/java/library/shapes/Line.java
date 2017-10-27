package library.shapes;

import library.StdDrawUtils;

public class Line implements Shape {
    double xStart;
    double yStart;
    double xEnd;
    double yEnd;

    public Line() {
    }

    public Line(double xStart, double yStart, double xEnd, double yEnd) {
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    public void draw()
    {
        StdDrawUtils.drawLine(xStart,yStart,xEnd,yEnd);
    }

    public double getxStart() {
        return xStart;
    }

    public void setxStart(double xStart) {
        this.xStart = xStart;
    }

    public double getyStart() {
        return yStart;
    }

    public void setyStart(double yStart) {
        this.yStart = yStart;
    }

    public double getxEnd() {
        return xEnd;
    }

    public void setxEnd(double xEnd) {
        this.xEnd = xEnd;
    }

    public double getyEnd() {
        return yEnd;
    }

    public void setyEnd(double yEnd) {
        this.yEnd = yEnd;
    }

}

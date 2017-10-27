package library;

import edu.princeton.cs.introcs.StdDraw;

public class StdDrawUtils {

    public static void drawLine(double xStart, double yStart, double xEnd, double yEnd)
    {
        StdDraw.line(xStart,yStart,xEnd,yEnd);
    }

    public static void drawCircle(double x, double y, double radius)
    {
        StdDraw.circle(x,y,radius);
    }

    public static void drawRectangle(double x, double y, double halfWidth, double halfHeight)
    {
        StdDraw.rectangle(x,y,halfWidth, halfHeight);
    }

    public static void drawEllipse(double x, double y, double semiMajorAxis, double semiMinorAxis)
    {
        StdDraw.ellipse(x,y,semiMajorAxis,semiMinorAxis);
    }

    public static void clear()
    {
        StdDraw.clear();
    }
}

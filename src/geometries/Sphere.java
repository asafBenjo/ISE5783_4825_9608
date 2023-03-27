package geometries;

import primitives.Point;

public class Sphere {
    Point center;
    double radius;
    public Sphere (Point p,double r)
    {
        center=p;
        radius=r;
    }
    public Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }
}

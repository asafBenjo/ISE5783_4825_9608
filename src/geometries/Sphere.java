package geometries;

import primitives.Point;
import primitives.Vector;

public class Sphere {
    Point center;
    double radius;

    public Sphere(Point p, double r) {
        center = p;
        radius = r;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
    public Vector getNormal(Point p) {
        return null;
    }
}

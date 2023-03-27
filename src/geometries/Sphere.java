package geometries;

import primitives.Point;
/**
 * Sphere class represents a sphere in 3D Cartesian coordinate system
 */
public class Sphere {
    /**
     * center of the sphere
     */
    Point center;
    /**
     * radius of the sphere
     */
    double radius;
    Sphere(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    /**
     * @return the center of the sphere
     *
     */
    public Point getCenter() {
        return center;
    }
    /**
     * @return the radius of the sphere
     *
     */
    public double getRadius() {
        return radius;
    }
}

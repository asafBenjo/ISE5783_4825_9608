package geometries;
/**
 * Sphere is a class that represents a sphere
 */
import primitives.Ray;
import primitives.Vector;
import primitives.Point;

import java.util.List;

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
   public Sphere(Point center, double radius) {
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
    /**
     * @param p
     * @return the normal to the sphere in the point p
     */
    public Vector getNormal(Point p) {

        return null;
    }
    public List<Point> findIntersections(Ray ray){
        Vector u = center.subtract(ray.getP0());
        double tm = ray.getDir().dotProduct(u);
        double d = Math.sqrt(u.lengthSquared() - tm * tm);
        if (d > radius)
            return null;
        double th = Math.sqrt(radius * radius - d * d);
        double t1 = tm - th;
        double t2 = tm + th;
        if (t1 > 0 && t2 > 0)
            return List.of(ray.getPoint(t1), ray.getPoint(t2));
        if (t1 > 0)
            return List.of(ray.getPoint(t1));
        if (t2 > 0)
            return List.of(ray.getPoint(t2));
        return null;
    }

}

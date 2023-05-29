package geometries;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

import static primitives.Util.alignZero;
import static primitives.Util.isZero;
/**
 * Plane is a class that represents a plane
 */
import primitives.Point;
import primitives.Vector;
/**
 * Plane class represents a plane in 3D Cartesian coordinate system
 */
public class Plane {
    /**
     * q0 is a point on the plane
     */
    Point q0;
    /**
     * normal is the normal to the plane
     */
    Vector normal;
/**
     * constructor for Plane
     * @param x
     * @param y
     * @param z
     */
    public Plane(Point x, Point y, Point z) {
        this.q0 = x;
        Vector U = x.subtract(y);
        Vector V = x.subtract(z);
        Vector N = U.crossProduct(V);
        q0 = x;
        this.normal = N.normalize();
    }
/**
     * constructor for Plane
     * @param x
     * @param norm
     */
    public Plane(Point x, Vector norm) {
        this.q0 = x;
        this.normal = norm.normalize();
    }
/**
     * @return the normal to the plane
     */
    public Vector getNormal(){
        return normal;
    }
/**
     * @param p
     * @return the normal to the plane in the point p
     */
    public Vector getNormal(Point p) {
        return normal;
    }
    public List<Point> findIntersections(Ray ray){
        Vector p0Q;
        try {
            p0Q = q0.subtract(ray.getP0());
        } catch (IllegalArgumentException e) {
            return null; // ray starts from point Q - no intersections
        }
        double nv = normal.dotProduct(ray.getDir());
        if (isZero(nv)) // ray is parallel to the plane - no intersections
            return null;
        double t = alignZero(normal.dotProduct(p0Q) / nv);
        return t <= 0 ? null : List.of(ray.getPoint(t));
    }
}

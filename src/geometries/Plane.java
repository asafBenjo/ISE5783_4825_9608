package geometries;
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
        normal = null;
    }
/**
     * constructor for Plane
     * @param x
     * @param norm
     */
    public Plane(Point x, Vector norm) {
        q0 = x;
        normal = norm;
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
}

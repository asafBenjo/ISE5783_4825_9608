package geometries;
/**
 * Sphere is a class that represents a sphere
 */
import primitives.Point;
import primitives.Vector;
/**
 * Sphere class represents a sphere in 3D Cartesian coordinate system
 */
public class Triangle extends Polygon {
    public Triangle(Point x, Point y, Point z) {
        super(x, y, z);
    }
/**
     * @param p
     * @return the normal to the sphere in the point p
     */
    public Vector getNormal(Point p) {
        return null;
    }
}


package geometries;
/**
 * Cylinder is a class that represents a cylinder
 */
import primitives.Point;
import primitives.Ray;
import primitives.Vector;

/**
 * Cylinder class represents a cylinder in 3D Cartesian coordinate system
 */
public class Cylinder extends Tube {
    private double height;
    /**
     * Cylinder constructor
     *
     * @param radius
     * @param axisRay
     * @param height
     */
    public Cylinder(double radius, Ray axisRay, double height) {
        super(radius, axisRay);
        this.height = height;
    }
    public Vector getNormal(Point p) {
        return null;
    }
}

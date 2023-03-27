package geometries;
/**
 * Sphere is a class that represents a sphere
 */
import primitives.Point;
import primitives.Ray;
import primitives.Vector;

/**
 * Tube is a class that represents a tube geometry
 */
public class Tube extends RadialGeometry {
    /**
     * axisRay of the tube
     */
    private Ray axisRay;
/**
     * Tube constructor
     *
     * @param radius
     * @param axisRay
     */
    public Tube(double radius, Ray axisRay) {
        super(radius);
        this.axisRay = axisRay;
    }
/**
     * @return the axisRay of the tube
     *
     */
    public Vector getNormal(Point p) {
        return null;
    }
}
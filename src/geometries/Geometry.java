package geometries;
/**
 * Geometry is an interface that represents a geometry
 */
import primitives.Point;
import primitives.Vector;

public interface Geometry {
    /**
     * @param p
     * @return the normal to the geometry in the point p
     */
   public Vector getNormal(Point p);
}

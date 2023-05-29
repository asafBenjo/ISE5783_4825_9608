package geometries;


import primitives.Point;
import primitives.Vector;
/**
 * Geometry is an interface that represents a geometry
 */
import primitives.Point;
import primitives.Vector;

public interface  Geometry extends Intersectable{
    /**
     * @param p
     * @return the normal to the geometry in the point p
     */
    public  Vector getNormal(Point p);
}
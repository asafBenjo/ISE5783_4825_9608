package geometries;

import primitives.Point;
import primitives.Vector;

public interface Geometry {
    /**
     * @param p
     * @return the normal to the geometry in the point p
     */
    Vector getNormal(Point p);
}

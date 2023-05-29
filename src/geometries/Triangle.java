package geometries;
/**
 * Sphere is a class that represents a sphere
 */
import primitives.Point;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

import static primitives.Util.isZero;

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
   public List<Point> findIntersections(Ray ray){
        Vector v1 = vertices.get(0).subtract(ray.getP0());
        Vector v2 = vertices.get(1).subtract(ray.getP0());
        Vector v3 = vertices.get(2).subtract(ray.getP0());
        Vector N1 = v1.crossProduct(v2);
        Vector N2 = v2.crossProduct(v3);
        Vector N3 = v3.crossProduct(v1);
        double s1 = ray.getDir().dotProduct(N1);
        double s2 = ray.getDir().dotProduct(N2);
        double s3 = ray.getDir().dotProduct(N3);
        if (isZero(s1) || isZero(s2) || isZero(s3))
            return null;
        if (s1 > 0 && s2 > 0 && s3 > 0 || s1 < 0 && s2 < 0 && s3 < 0)
            return null;
        Point p = ray.getPoint(s1 / N1.length());
        return List.of(p);

   }
}

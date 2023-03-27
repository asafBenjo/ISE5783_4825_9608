package geometries;

import primitives.Point;
import primitives.Vector;

public class Triangle extends Polygon
{
    public Triangle (Point x,Point y,Point z)
    {
        Polygon (x);
    }
    public Vector getNormal(Point p) {
        return null;
    }
}

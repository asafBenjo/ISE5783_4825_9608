package geometries;

import primitives.Point;
import primitives.Vector;

public class Plane {
    Point q0;
    Vector normal;
    public Plane(Point x,Point y,Point z)
    {
        normal=null;
    }
    public Plane(Point x, Vector norm)
    {
        q0=x;
        normal=norm;
    }
    public Point getPoint()
    {
        return q0;
    }
    public Vector getNormal()
    {
        return normal;
    }
    public Vector getNormal(Point p)
    {
        return null;
    }
}

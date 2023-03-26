package geometries;

import primitives.Point;
import primitives.Vector;

public class Plane {
    Point q0;
    Vector normal;
    public Plane(Point x,Point y,Point z)
    {

    }
    public Plane(Point x, Vector norm)
    {
        q0=x;
        normal=norm;
    }
}

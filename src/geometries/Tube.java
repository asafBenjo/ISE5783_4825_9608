package geometries;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

public class Tube {
    Ray axisRay;

    public Ray getAxisRay() {
        return axisRay;
    }

    public Tube(Ray axisRay) {
        this.axisRay = axisRay;
    }
    public Vector getNormal(Point p)
    {

    }
}

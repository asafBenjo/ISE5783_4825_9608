 package geometries;
 import primitives.Point;
 import primitives.Ray;

 import java.util.List;


import java.util.LinkedList;
 import static primitives.Util.*;
import java.util.List;
public class Geometries {
    List<Intersectable> geom;
    public Geometries() {
        List<Intersectable> geom = new LinkedList<>();
    }
    public Geometries(Intersectable... geometries) {
        List<Intersectable> geom = new LinkedList<>();
        for (Intersectable geo : geometries) {
            geom.add(geo);
        }
    }
    public void add(Intersectable... geometries) {
        for (Intersectable geo : geometries) {
            geom.add(geo);
        }
    }
    public List<Point> findIntersections(Ray ray) {
        List<Point> intersections = null;
        for (Intersectable geo : geom) {
            List<Point> tempIntersections = geo.findIntersections(ray);
            if (tempIntersections != null) {
                if (intersections == null)
                    intersections = new LinkedList<>();
                intersections.addAll(tempIntersections);
            }
        }
        return intersections;
    }

}

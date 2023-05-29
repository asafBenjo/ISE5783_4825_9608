package geometries;
import java.util.List;
import primitives.*;

public interface Intersectable {
    /**
     * @param ray
     * @return list of intersection points
     */
    List<Point> findIntersections(Ray ray);


}

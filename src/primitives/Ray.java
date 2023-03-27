/**
 * Ray class represents a ray in 3D Cartesian coordinate system.
 * The class has a Point3D and a Vector.
 * The class has a constructor and getters.
 * The class has a toString and equals methods.
 * @author
 * @version 1.0
 * @since 2020-06-10
 */
package primitives;

import primitives.Point;
import primitives.Vector;

import java.util.Objects;

public class Ray {
    /**
     * p0 is the point of the ray
     */
    private final  Point p0;
    /**
     * dir is the direction of the ray
     */
    private final  Vector dir;
/**
     * constructor for Ray
     * @param p
     * @param v
     */
   public Ray (Point p,Vector v)
   {
    p0=p;
    dir=v.normalize();
   }
/**
     * @return the point of the ray
     */
    public Point getP0() {
        return p0;
    }
/**
     * @return the direction of the ray
     */
    public Vector getDir() {
        return dir;
    }
/**
     * @return the string of the ray
     */
    @Override
    public String toString() {
        return "Ray{" +
                "p0=" + p0 +
                ", dir=" + dir +
                '}';
    }
/**
     * @return the string of the ray
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return (o instanceof Ray ray)&&Objects.equals(p0, ray.p0) && Objects.equals(dir, ray.dir);
    }
}
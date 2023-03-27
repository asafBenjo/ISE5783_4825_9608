package primitives;

import primitives.Point;
import primitives.Vector;

import java.util.Objects;

public class Ray {
    private final  Point p0;
    private final  Vector dir;

   public Ray (Point p,Vector v)
   {
    p0=p;
    dir=v.normalize();
   }

    public Point getP0() {
        return p0;
    }

    public Vector getDir() {
        return dir;
    }

    @Override
    public String toString() {
        return "Ray{" +
                "p0=" + p0 +
                ", dir=" + dir +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return (o instanceof Ray ray)&&Objects.equals(p0, ray.p0) && Objects.equals(dir, ray.dir);
    }
}
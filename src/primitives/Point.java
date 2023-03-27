package primitives;

import primitives.Double3;
import primitives.Vector;

import java.util.Objects;

public class Point {
    final Double3 xyz;

    public Point(double x, double y, double z) {
        xyz = new Double3(x, y, z);
    }

    Point(Double3 doubie) {
        this(doubie.d1, doubie.d2, doubie.d3);
    }

    @Override
    public String toString() {
        return "Point: " + xyz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return xyz.equals(point.xyz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xyz);
    }

    public Vector subtract(Point point) {
        return new Vector(point.xyz.subtract(xyz));
    }

    /**
     * @param v
     * @return the point after adding the vector v to the point
     */
    public Point add(Vector v) {
        return new Point(xyz.add(v.xyz));
    }

    //@Override
    public double distanceSquared(Point p) {
        double dx = (xyz.d1 - p.xyz.d1);
        double dy = (xyz.d2 - p.xyz.d2);
        double dz = (xyz.d3 - p.xyz.d3);
        return dx * dx + dy * dy + dz * dz;
    }

    //@Override
    public double distance(Point p2) {
        return Math.sqrt(distanceSquared(p2));
    }

}

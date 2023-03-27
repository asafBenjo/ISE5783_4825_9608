package primitives;
/**
 * Point is a class that represents a point in 3D Cartesian coordinate system
 */
import primitives.Double3;
import primitives.Vector;

import java.util.Objects;

public class Point {
    /**
     * xyz is a point in 3D Cartesian coordinate system
     */
    final Double3 xyz;
/**
     * constructor for Point
     * @param x
     * @param y
     * @param z
     */
    public Point(double x, double y, double z) {
        xyz = new Double3(x, y, z);
    }
    /**
     * constructor for Point
     * @param xyz
     */
    Point(Double3 xyz) {
        this.xyz = xyz;
    }
/**
     * @return the x coordinate of the point
     */
    @Override
    public String toString() {
        return "Point: " + xyz;
    }
/**
     * @return the x coordinate of the point
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return (o instanceof Point point) && (xyz.equals(point.xyz));
    }
/**
     * @return the x coordinate of the point
     */
    @Override
    public int hashCode() {
        return Objects.hash(xyz);
    }
/**
     * @return the x coordinate of the point
     */
    public Vector subtract(Point point) {
        return new Vector(xyz.subtract(point.xyz));
    }

    /**
     * @param v
     * @return the point after adding the vector v to the point
     */
    public Point add(Vector v) {
        return new Point(xyz.add(v.xyz));
    }
/**
     * @param p
     * @return the distance squared between the point and the point p
     */
    //@Override
    public double distanceSquared(Point p) {
        double dx = (xyz.d1 - p.xyz.d1);
        double dy = (xyz.d2 - p.xyz.d2);
        double dz = (xyz.d3 - p.xyz.d3);
        return dx * dx + dy * dy + dz * dz;
    }
/**
     * @param p
     * @return the distance between the point and the point p
     */
    //@Override
    public double distance(Point p2) {
        return Math.sqrt(distanceSquared(p2));
    }

}

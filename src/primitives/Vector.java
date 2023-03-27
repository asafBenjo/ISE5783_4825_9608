package primitives;

import primitives.Point;

public class Vector extends Point {

    public Vector(double x, double y, double z) {
        super(x, y, z);
        if (xyz.equals(primitives.Double3.ZERO)) {
            throw new IllegalArgumentException("vector canoot be zero");
        }
    }

    Vector(primitives.Double3 double3) {
        this(double3.d1, double3.d1, double3.d1);
    }

    public double lengthSquared() {
        double dx = xyz.d1;
        double dy = xyz.d2;
        double dz = xyz.d3;
        return dx * dx + dy * dy + dz * dz;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector v)) return false;
        return xyz.equals(v.xyz);
    }

    public Vector normalize() {
        double len = length();
        return new Vector(xyz.reduce(len));
    }

    public Vector add(Vector v) {
        return new Vector(xyz.d1 + v.xyz.d1, xyz.d2 + v.xyz.d2, xyz.d3 + v.xyz.d3);
    }

    public Vector scale(int t) {
        return new Vector(t * xyz.d1, t * xyz.d2, t * xyz.d3);
    }

    public double dotProduct(Vector v) {
        return (v.xyz.d1 * xyz.d1 + v.xyz.d2 * xyz.d2 + v.xyz.d3 * xyz.d3);
    }

    public Vector crossProduct(Vector v) {
        return new Vector(xyz.d2 * v.xyz.d3 - xyz.d3 * v.xyz.d2, xyz.d3 * v.xyz.d1 - xyz.d1 * v.xyz.d3, xyz.d1 * v.xyz.d2 - xyz.d2 * v.xyz.d1);
    }

}

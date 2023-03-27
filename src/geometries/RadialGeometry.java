package geometries;

/**
 * RadialGeometry is an abstract class that represents a geometry with a radius
 */
public abstract class RadialGeometry {
    protected double radius;

    /**
     * RadialGeometry constructor
     *
     * @param num
     */
    public RadialGeometry(double num) {
        radius = num;
    }
}

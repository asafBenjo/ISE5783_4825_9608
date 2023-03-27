package geometries;

public class Cylinder extends Tube {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
}

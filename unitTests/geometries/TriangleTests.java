package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle tr = new Triangle(new Point(0, 0, 1), new Point(1, 0, 0), new Point(0, 1, 0));
    Plane pl = new Plane(new Point(0, 0, 1), new Point(1, 0, 0), new Point(0, 1, 0));
    Ray ray;

    /**
     * Test method for {@link geometries.Polygon#getNormal(primitives.Point)}.
     */
    @Test
    public void testGetNormal() {
        // ============ Equivalence Partitions Tests ==============
        // TC01: There is a simple single test here
        Triangle pl = new Triangle(new Point(0, 0, 1), new Point(1, 0, 0), new Point(0, 1, 0));
        double sqrt3 = Math.sqrt(1d / 3);
        assertEquals(new Vector(sqrt3, sqrt3, sqrt3),
                pl.getNormal(new Point(0, 0, 1)),
                "Bad normal to triangle");
    }
public void testFindIntersections() {
        Triangle triangle = new Triangle(new Point(0, 0, 1), new Point(1, 0, 0), new Point(0, 1, 0));
        // ============ Equivalence Partitions Tests ==============
        // TC01: Ray intersects the triangle (1 points)
        assertEquals(List.of(new Point(0.25, 0.25, 0.5)),
                triangle.findIntersections(new Ray(new Point(0.25, 0.25, 0), new Vector(0, 0, 1))),
                "Ray intersects the triangle");
        // TC02: Ray does not intersect the triangle (0 points)
        assertNull(triangle.findIntersections(new Ray(new Point(1, 1, 0), new Vector(0, 0, -1))),
                "Ray does not intersect the triangle");
        // =============== Boundary Values Tests ==================
        // **** Group: Ray is parallel to the triangle
        // TC11: Ray is included in the triangle (0 points)
        assertNull(triangle.findIntersections(new Ray(new Point(0.25, 0.25, 0), new Vector(0, 0, 1))),
                "Ray is included in the triangle");
        // TC12: Ray is not included in the triangle (0 points)
        assertNull(triangle.findIntersections(new Ray(new Point(1, 1, 0), new Vector(0, 0, 1))),
                "Ray is not included in the triangle");
        // **** Group: Ray is orthogonal to the triangle
        // TC13: Ray starts before the triangle (1 points)
        assertEquals(List.of(new Point(0.25, 0.25, 0.5)),
                triangle.findIntersections(new Ray(new Point(0.25, 0.25, 1), new Vector(0, 0, -1))),
                "Ray starts before the triangle");
        // TC14: Ray starts in the triangle (0 points)
        assertNull(triangle.findIntersections(new Ray(new Point(0.25, 0.25, 0), new Vector(0, 0, 1))),
                "Ray starts in the triangle");
    }

}
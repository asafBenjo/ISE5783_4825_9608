package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    /**
     * Test method for {@link geometries.Plane#getNormal(primitives.Point)}.
     */
    @Test
    public void testGetNormalPoint() {
        // ============ Equivalence Partitions Tests ==============
        // TC01: There is a simple single test here
        Plane pl = new Plane(new Point(0, 0, 1), new Point(1, 0, 0), new Point(0, 1, 0));
        double sqrt3 = Math.sqrt(1d / 3);
        assertEquals(new Vector(sqrt3, sqrt3, sqrt3), pl.getNormal(new Point(0, 0, 1)), "Bad normal to plane");
    }

    /**
     * Test method for {@link geometries.Polygon#getNormal(primitives.Point)}.
     */
    @Test
    public void testGetNormal2() {
        // ============ Equivalence Partitions Tests ==============
        // TC01: There is a simple single test here
        Plane pl = new Plane(new Point(0, 0, 1), new Point(1, 0, 0), new Point(-1, 1, 1));
        double sqrt3 = Math.sqrt(1d / 3);
        assertEquals(new Vector(sqrt3, sqrt3, sqrt3), pl.getNormal(new Point(0, 0, 1)), "Bad normal to trinagle");
    }
    public void testFindIntersections() {
        Plane plane = new Plane(new Point(0, 0, 1), new Vector(0, 0, 1));
        // ============ Equivalence Partitions Tests ==============
        // TC01: Ray intersects the plane (1 points)
        assertEquals(List.of(new Point(1, 1, 1)), plane.findIntersections(new Ray(new Point(1, 1, 0), new Vector(0, 0, 1))),
                "Ray intersects the plane");
        // TC02: Ray does not intersect the plane (0 points)
        assertNull(plane.findIntersections(new Ray(new Point(1, 1, 0), new Vector(0, 0, -1))),
                "Ray does not intersect the plane");
        // =============== Boundary Values Tests ==================
        // **** Group: Ray is parallel to the plane
        // TC11: Ray is included in the plane (0 points)
        assertNull(plane.findIntersections(new Ray(new Point(1, 1, 1), new Vector(0, 0, 1))),
                "Ray is included in the plane");
        // TC12: Ray is not included in the plane (0 points)
        assertNull(plane.findIntersections(new Ray(new Point(1, 1, 0), new Vector(0, 0, 1))),
                "Ray is not included in the plane");
        // **** Group: Ray is orthogonal to the plane
        // TC13: Ray starts before the plane (1 points)
        assertEquals(List.of(new Point(1, 1, 1)), plane.findIntersections(new Ray(new Point(1, 1, 1), new Vector(0, 0, 1))),
                "Ray starts before the plane");
        // TC14: Ray starts in the plane (0 points)
        assertNull(plane.findIntersections(new Ray(new Point(1, 1, 0), new Vector(0, 0, 1))),
                "Ray starts in the plane");
        // TC15: Ray starts after the plane (0 points)
        assertNull(plane.findIntersections(new Ray(new Point(1, 1, -1), new Vector(0, 0, 1))),
                "Ray starts after the plane");
        // **** Group: Special cases
        // TC16: Ray is neither orthogonal nor parallel to and begins at the plane (
    }
}
package geometries;
import primitives.Point;
import primitives.Ray;
import java.util.List;
import primitives.Vector;
import static org.junit.jupiter.api.Assertions.*;

class GeometriesTests {

        @org.junit.jupiter.api.Test
        void findIntersections() {
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
        }

}
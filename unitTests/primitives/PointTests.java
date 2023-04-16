package primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTests {

    Point p = new Point(1,1,1);
    @Test
    void testSubtract1() {
        assertEquals(new Vector(0,-1,4),p.subtract(new Point(1,2,-3)),"bachalom!!");
    }
    @Test
    void testSubtract2() {
        assertThrows(IllegalArgumentException.class, () -> p.subtract(p),"Vector(0,0,0) is not not legal");
    }
    @Test
    void testAdd() {
        assertEquals(new Point(2,3,4),p.add(new Vector(1,2,3)),
                "Wrong point add");
    }

    @Test
    void testDistanceSquared() {
        assertEquals(14,p.distanceSquared(new Point(2,3,4)),"Wrong distance squared");
    }

    @Test
    void testDistance() {
        assertEquals(3.7416573867739413,p.distance(new Point(2,3,4)),"Wrong distance");
    }
}
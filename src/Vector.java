package primitives;

import primitives.Point;

class Vector extends Point{

    public Vector (double x,double y,double z)
    {
        super(x,y,z);
        if(xyz.equals(primitives.Double3.ZERO))
        {
            throw new IllegalArgumentException("vector canoot be zero")
        }
    }
    Vector (primitives.Double3 double3)
    {
       this(double3.d1,double3.d1,double3.d1);
    }
    public double lengthSquared()
    {
        double dx=xyz.d1;
        double dy=xyz.d2;
        double dz=xyz.d3;
        return dx*dx+dy*dy+dz*dz;
    }
    public double length()
    {
        return Math.sqrt(lengthSquared());
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector v)) return false;
        return xyz.equals(v.xyz);
    }
    public Vector normalize()
    {
        double len=length();
        return new Vector(xyz.reduce(len));
    }
}

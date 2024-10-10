package geometry;

import utility.Color;
import utility.Point3D;
import utility.Ray;
import utility.Vector3D;

public class Triangle extends GeometricObject
{
    public Vector3D v0, v1, v2;
    public Color color;

    public Triangle(Vector3D v0, Vector3D v1, Vector3D v2, Color color)
    {
        this.v0 = v0;
        this.v1 = v1;
        this.v2 = v2;
        this.color = color;
    }

    @Override
    public double hit(Ray ray)
    {
        return 0;
    }
}

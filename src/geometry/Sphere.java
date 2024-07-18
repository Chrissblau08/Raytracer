package geometry;

import utility.Color;
import utility.Point3D;
import utility.Ray;

public class Sphere extends GeometricObject
{
    Point3D center;
    double radius;

    public Sphere(Point3D center, double radius, Color color)
    {
        this.center = new Point3D(center);
        this.radius = radius;
        this.color = new Color(color);

    }

    @Override
    public double hit(Ray ray) {

        return 0;
    }
}

package geometry;

import utility.Color;
import utility.Normal;
import utility.Point3D;
import utility.Ray;

public class Plane extends GeometricObject
{
    Point3D point3D;
    Normal normal;

    public Plane(Point3D point, Normal normal, Color color)
    {
        this.point3D = new Point3D(point);
        this.normal = new Normal(normal);
        this.color = new Color(color);
    }

    @Override
    public double hit(Ray ray)
    {
        double t = point3D.sub(ray.origin).dot(normal)/ray.direction.dot(normal);
        if(t > 10E-8) return t;
        return 0;
    }
}

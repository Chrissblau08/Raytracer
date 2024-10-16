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
        double a = ray.direction.dot(ray.direction);
        double b = 2*ray.origin.sub(center).dot(ray.direction);
        double c = ray.origin.sub(center).dot(ray.origin.sub(center)) - radius*radius;
        double discriminant = b*b - 4*a*c;

        if(discriminant < 0) return 0.0;
        double t = (-b - Math.sqrt(discriminant))/(2*a);
        if(t > 10E-9) return t;
        return 0.0;
    }
}

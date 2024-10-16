package geometry;

import utility.Color;
import utility.Ray;

public abstract class GeometricObject
{
    public Color color;
    public abstract double hit(Ray ray);
}

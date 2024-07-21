package utility;

public class Point3D {
    public double x,y,z;

    public Point3D()
    {
        this.x=0.0;
        this.y=0.0;
        this.z=0.0;
    }

    public Point3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(Point3D point3D)
    {
        x=point3D.x;
        y=point3D.y;
        z=point3D.z;
    }

    public Point3D add(Point3D point3D)
    {
        return new Point3D(this.x+point3D.x,this.y+point3D.y,this.z+point3D.z);
    }

    public Point3D sub(Point3D point3D)
    {
        return new Point3D(this.x-point3D.x,this.y-point3D.y,this.z-point3D.z);
    }

    public Vector3D sub_vec(Point3D point3D)
    {
        return new Vector3D(this.x-point3D.x,this.y-point3D.y,this.z-point3D.z);
    }

    public double dot(Point3D point3D)
    {
        return x*point3D.x+y*point3D.y+z*point3D.z;
    }

    public double dot(Vector3D vector3D)
    {
        return x*vector3D.x+y*vector3D.y+z*vector3D.z;
    }

    public double dot(Normal normal)
    {
        return x * normal.x + y * normal.y + z * normal.z;
    }
}

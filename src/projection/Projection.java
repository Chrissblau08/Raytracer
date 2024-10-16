package projection;

import utility.Point2D;
import utility.Point3D;
import utility.Ray;
import utility.Vector3D;

public abstract class Projection
{
    public Point3D eye;
    public Point3D lookAt;
    public double distance;
    public Vector3D u, v, w;

    public abstract Ray createRay(Point2D point);

    public void compute_uvw()
    {
        w = eye.sub_vec(lookAt);
        w.normalize();

        Vector3D up = new Vector3D(0.00424, 1.0, 0.00764);

        u = up.cross(w);
        u.normalize();

        v = w.cross(u);
        v.normalize();
    }
}

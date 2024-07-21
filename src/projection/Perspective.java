package projection;

import main.Driver;
import utility.Point2D;
import utility.Point3D;
import utility.Ray;
import utility.Vector3D;

public class Perspective extends Projection
{
    public Perspective(Point3D eye, Point3D lookAt, double FOV) //FOV = Field of View
    {
        this.eye = new Point3D(eye);
        this.lookAt = new Point3D(lookAt);
        this.distance = Driver.world.viewPlane.height/2.0/Math.tan(Math.toRadians(FOV));

        compute_uvw();
    }

    @Override
    public Ray createRay(Point2D point) {
        Ray ray = new Ray(new Point3D(eye), u.multi(point.x).add(v.multi(point.y).sub(w.multi(distance))));
        ray.direction.normalize();

        return ray;
    }
}

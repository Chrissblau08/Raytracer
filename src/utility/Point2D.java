package utility;

public class Point2D
{
    double x,y;

    public Point2D()
    {
        x=y=0;
    }

    public Point2D(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public Point2D(Point2D point2D)
    {
        this.x=point2D.x;
        this.y=point2D.y;
    }

    public Point2D add(Point2D point2D)
    {
        return new Point2D(x+point2D.x, y+point2D.y);
    }

    public Point2D sub(Point2D point2D)
    {
        return new Point2D(x-point2D.x, y-point2D.y);
    }
}

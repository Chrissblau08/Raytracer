package sampling;

import main.Driver;
import utility.Point2D;
import java.util.Random;

public class JitteredSample extends Sampler
{
    private Random random;
    public JitteredSample(int samples)
    {
        this.samples = samples;
        random = new Random();
    }

    @Override
    public Point2D sample(int row, int col, int x, int y) {
        Point2D point = new Point2D();
        point.x = x - Driver.world.viewPlane.width/2+(col+random.nextFloat())/samples;
        point.y = y - Driver.world.viewPlane.height/2+(row+random.nextFloat())/samples;
        return point;
    }
}

import geometry.Sphere;
import utility.Color;
import utility.Point3D;
import utility.Ray;
import utility.Vector3D;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Driver
{
    File src = new File("Image.png");

    int height = 480;
    int width = 640;

    long start = System.nanoTime();

    Driver() throws IOException {
        run();
    }

    void run() throws IOException {
        BufferedImage buffer = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        Sphere sphere = new Sphere(new Point3D(0,0,0),60,new Color(1,0,0,0));

        for (int i = 0; i < height;i++) {
            for (int j = 0; j < width; j++) {
                //buffer.setRGB(j,i,1000);
                Ray ray = new Ray(new Point3D(j-width/2+.5,i-height/2+.5, 100), new Vector3D(0,0,-1));
                if(sphere.hit(ray) != 0.0)
                {
                    buffer.setRGB(j,i, sphere.color.toInteger());
                }
                else{
                    buffer.setRGB(j,i,0);
                }
            }
        }

        ImageIO.write(buffer,"PNG",src);
        long end = System.nanoTime();

        System.out.println("Loop-Time: " +  (end-start) / 1000000 + "ms\n");
    }


    public static void main(String[] args) throws IOException {
        new Driver();
    }
}

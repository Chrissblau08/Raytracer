package main;

import geometry.Sphere;
import projection.Orthographic;
import projection.Perspective;
import projection.Projection;
import sampling.JitteredSample;
import sampling.RegularSample;
import sampling.Sampler;
import scene.World;
import utility.*;
import java.util.Random;

public class Driver
{
    //File src = new File("Image.png");
    public static World world;
    public static Image image;
    public static Tracer tracer;
    public static Sampler sampler;
    public static Projection projection;


    public static void main(String[] args){
        world = new World(1600, 900, 1.0);
        image = new Image("Image.png");
        tracer = new Tracer();
        sampler = new RegularSample(4);
        //sampler = new JitteredSample(8);
        projection = new Perspective(new Point3D(-200.0,200.0, 600.0), new Point3D(0.0,0.0,0.0), 30.0);

        long start = System.nanoTime();

        for (int i = 0; i < world.viewPlane.height;i++) {
            for (int j = 0; j < world.viewPlane.width; j++) {
                tracer.trace(j,i);
            }
        }

        image.write("PNG");
        long end = System.nanoTime();

        System.out.println("Loop-Time: " +  (end-start) / 1000000 + "ms\n");
    }
}

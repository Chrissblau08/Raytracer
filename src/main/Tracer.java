package main;

import utility.*;

public class Tracer
{
    public void trace(int x, int y)
    {
        Color color = new Color(0.0F,0.0F,0.0F,0.0F);
        boolean hit = false;

        for(int row = 0; row < Driver.sampler.samples;row++)
        {
            for(int col = 0; col < Driver.sampler.samples;col++)
            {
                Point2D point = Driver.sampler.sample(row,col,x,y);
                Ray ray = Driver.projection.createRay(point);

                double min = Double.MAX_VALUE;
                Color tmpColor = Driver.world.backgroundColor;

                for(int i = 0; i < Driver.world.objects.size();i++)
                {
                    double temp = Driver.world.objects.get(i).hit(ray);
                    if(temp != 0.0 && temp < min) {
                        min = temp;
                        hit = true;
                        tmpColor = Driver.world.objects.get(i).color;
                    }
                }
                color.add(tmpColor);
            }
        }
        color.divide(Driver.sampler.samples * Driver.sampler.samples);
        if(hit)
            Driver.image.bufferedImage.setRGB(x,Driver.world.viewPlane.height-y-1,color.toInteger());
        else
            Driver.image.bufferedImage.setRGB(x,Driver.world.viewPlane.height-y-1, Driver.world.backgroundColor.toInteger());
    }
}

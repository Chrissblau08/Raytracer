package utility;

import main.Driver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Image
{
    public BufferedImage bufferedImage;
    public File image;

    public Image(String filename)
    {
        image = new File(filename);
        bufferedImage = new BufferedImage(Driver.world.viewPlane.width, Driver.world.viewPlane.height, BufferedImage.TYPE_INT_RGB);
    }

    public void write(String filetype)
    {
        try{
            ImageIO.write(bufferedImage,filetype,image);
        }catch (Exception e)
        {
            System.out.println("Could not write image to file");
            System.exit(1);
        }
    }
}

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

        for (int i = 0; i < height;i++) {
            for (int j = 0; j < width; j++) {
                buffer.setRGB(j,i,1000);
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

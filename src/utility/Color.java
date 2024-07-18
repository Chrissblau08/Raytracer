package utility;

public class Color
{
    float r,g,b,a;

    public Color()
    {
        r = g = b = a = 0.0F;
    }

    public Color(float r, float g, float b, float a)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public Color(Color color)
    {
        r = color.r;
        g = color.g;
        b = color.b;
        a = color.a;
    }

    public void add(Color color)
    {
        r += color.r;
        g += color.g;
        b += color.b;
        //a += color.a;
    }

    public void sub(Color color)
    {
        r -= color.r;
        g -= color.g;
        b -= color.b;
        //a -= color.a;
    }

    public void divide(int scalar)
    {
        r /= scalar;
        g /= scalar;
        b /= scalar;
        //a /= scalar;
    }

    public int toInteger()
    {
        return (int)(r*255) << 16 | (int)(g*255) << 8 | (int)(b*255);
    }

}

package pl.imiajd.falkowski;

import java.awt.Rectangle;

public class BetterRectangle
{
    Rectangle a;

    public BetterRectangle(int szerokosc, int wysokosc)
    {
        this.a = new Rectangle();
        a.setSize(szerokosc,wysokosc);
        a.setLocation(1,1);
    }

    public int getArea()
    {
        return this.a.width*this.a.height;
    }

    public int getPerimeter()
    {
        return 2*(this.a.width+this.a.height);
    }

    public String toString()
    {
        return "Pole prostokata wynosi: "+getArea()+", a jego obwód: "+getPerimeter();
    }

}


class Test
{
    public static void main(String[] args)
    {
        BetterRectangle rectangle1 = new BetterRectangle(2,4);

        System.out.println(rectangle1.toString());
    }
}
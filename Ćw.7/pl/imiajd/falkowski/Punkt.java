package pl.imiajd.falkowski;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

class Punkt
{
    private int x;
    private int y;

    Punkt(int var1, int var2)
    {
        this.x = var1;
        this.y = var2;
    }

    public void show()
    {
        System.out.println("<" + this.x + ", " + this.y + ">");
    }

    public int x()
    {
        return this.x;
    }

    public int y()
    {
        return this.y;
    }
}

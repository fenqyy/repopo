import java.util.ArrayList;
import java.util.Collections;


public class Cw5
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println(append(a,b));
        System.out.println(merge(a,b));
        System.out.println(mergeSorted(a,b));
        System.out.println(reversed(a));
        System.out.println(reverse(a));
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.addAll(a);
        c.addAll(b);
        return c;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> c = new ArrayList<Integer>();
        int i=0;
        int rozmiar = 0;
        if(a.size() > b.size())
        {
            rozmiar = a.size();
        }
        else
        {
            rozmiar = b.size();
        }
        while(i != rozmiar)
        {
            if(a.size()>i)
            {
                c.add(a.get(i));
            }
            if(b.size()>i)
            {
                c.add(b.get(i));
            }
            i++;
        }
        return c;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.addAll(a);
        c.addAll(b);
        Collections.sort(c);
        return c;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        System.out.println(a);
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i = a.size()-1;i>=0;i--)
        {
            c.add(a.get(i));
        }
        return c;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> a)
    {
        System.out.println(a);
        int x = a.size()-1;
        for(int i=0;i<Math.round(a.size()/2);i++)
        {
            int zamien = a.get(i);
            a.set(i,a.get(x));
            a.set(x, zamien);
            x--;
        }
        return a;
    }
}


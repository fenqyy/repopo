package pl.imiajd.falkowski;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Osoba implements Cloneable, Comparable<Osoba>
{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public LocalDate getdataUrodzenia()
    {
        return dataUrodzenia;
    }


    public boolean equals(Osoba o)
    {
        if(o instanceof Osoba)
        {
            Osoba osoba2 = o;
            return nazwisko.equals(osoba2.nazwisko) && dataUrodzenia.equals(osoba2.dataUrodzenia);
        }
        return false;
    }

    public int compareTo(Osoba o)
    {
        int n = this.nazwisko.compareTo(o.nazwisko);
        int d = this.dataUrodzenia.compareTo(o.dataUrodzenia);
        if(n==0)
        {
            if(d==0)
            {
                return 0;
            }
            else
            {
                return d;
            }
        }
        if(n<0)
        {
            if(d<0)
            {
                return -1;
            }
        }

        return 1;
    }

    public String toString()
    {
        return "["+nazwisko+"]"+dataUrodzenia;
    }


}

class TestOsoba
{
    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        Osoba o1 = new Osoba("Falkowski", LocalDate.parse("2000-09-12"));
        Osoba o2 = new Osoba("Kowalski", LocalDate.parse("2001-09-19"));
        Osoba o3 = new Osoba("Kowalski", LocalDate.parse("2020-01-11"));
        Osoba o4 = new Osoba("Gawron", LocalDate.parse("2002-09-15"));
        Osoba o5 = new Osoba("Baran", LocalDate.parse("2002-09-15"));
        grupa.add(o1);
        grupa.add(o2);
        grupa.add(o3);
        grupa.add(o4);
        grupa.add(o5);
        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
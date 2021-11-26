package pl.imiajd.falkowski;

public class Osoba
{
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public int getRokUrodzenia()
    {
        return rokUrodzenia;
    }

    public String toString()
    {
        return nazwisko+", "+rokUrodzenia;
    }
}


class Student extends Osoba
{
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek)
    {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek()
    {
        return kierunek;
    }

    public String toString()
    {
        return super.toString()+", "+kierunek;
    }
}


class Nauczyciel extends Osoba
{
    private int pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja)
    {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public int getPensja()
    {
        return pensja;
    }

    public String toString()
    {
        return super.toString()+", "+pensja;
    }

}

class test
{
    public static void main(String[] args)
    {
        Osoba osoba1 = new Osoba("Kononowicz", 1929);
        Student student1 = new Student("Polak", 1998, "Weterynaria");
        Nauczyciel nauczyciel1 = new Nauczyciel("Kozak",1900, 4500);
        System.out.println(osoba1.toString());
        System.out.println(student1.toString());
        System.out.println(nauczyciel1.toString());

    }
}

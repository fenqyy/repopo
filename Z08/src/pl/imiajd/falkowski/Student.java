package pl.imiajd.falkowski;

import java.time.LocalDate;

public class Student extends Osoba
{
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen()
    {
        return sredniaOcen;
    }

    public String toString()
    {
        return super.toString()+", "+sredniaOcen;
    }
}

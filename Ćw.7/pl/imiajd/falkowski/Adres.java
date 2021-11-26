package pl.imiajd.falkowski;


public class Adres
{
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void Adres2(String ulica, int numer_domu, String miasto, String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getUlica()
    {
        return ulica;
    }

    public int getNumer_domu()
    {
        return numer_domu;
    }

    public int getNumer_mieszkania()
    {
        return numer_mieszkania;
    }

    public String getMiasto()
    {
        return miasto;
    }

    public String getKod_pocztowy()
    {
        return kod_pocztowy;
    }

    public void pokaz()
    {
        System.out.println(miasto+", "+kod_pocztowy+"\n");
        System.out.println(ulica+", "+numer_domu+"/"+numer_mieszkania);
    }

    public boolean przed(String postalCode)
    {
        String Code = this.kod_pocztowy;
        String newCode = postalCode;
        Code.replace("-","");
        newCode.replace("-","");
        double CodeInt = Double.parseDouble(Code);
        double newCodeInt = Double.parseDouble(newCode);
        if(CodeInt<newCodeInt)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

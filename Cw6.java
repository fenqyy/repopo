class RachunekBankowy
{
    static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo, double rocznaStopaProcentowa)
    {
        this.saldo = saldo;
        this.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public double obliczMiesieczneOdsetki()
    {
        return saldo += (saldo*rocznaStopaProcentowa)/12;
    }

    public static void setRocznaStopaProcentowa(double nowaStopaProcentowa)
    {
        rocznaStopaProcentowa = nowaStopaProcentowa;
    }

}


class Cw6
{
    public static void main(String[] args)
    {
        RachunekBankowy saver1 = new RachunekBankowy(2000.0,1.04);
        RachunekBankowy saver2 = new RachunekBankowy(3000.0,1.04);
        System.out.println(saver1.getSaldo());
        saver1.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver2.getSaldo());
        RachunekBankowy.setRocznaStopaProcentowa(1.05);
        saver2.obliczMiesieczneOdsetki();
        saver1.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());
    }
}

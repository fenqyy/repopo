/* ZADANIE 2.
import java.util.Scanner;
import java.util.Random;

public class Cw3
{
    public static void main(String[] args)
    {
        System.out.println("Podaj liczbe n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n<1 || n>100)
        {
            System.out.println("Wyszedles poza zakres, podaj liczbe z zakresu 1<=n<=100!");
        }
        int[] tab = new int[10];
        generuj(tab, n, -999, 999);
        wypisz(tab);
        System.out.println(ileNieparzystych(tab,n));
        System.out.println(ileParzystych(tab,n));
        System.out.println(ileDodatnich(tab,n));
        System.out.println(ileUjemnych(tab,n));
        System.out.println(ileZerowych(tab,n));
        System.out.println(ileMaksymalnych(tab,n));
        System.out.println(sumaDodatnich(tab,n));
        System.out.println(sumaUjemnych(tab,n));
        System.out.println(dlugoscMaksymalnegoCiaguDodatnich(tab,n));
        signum(tab);
        wypisz(tab);
        odwrocFragment(tab,2,5,n);
        wypisz(tab);
    }

    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc)
    {
        Random r = new Random();
        for(int i=0; i<n; i++)
        {
            tab[i] = r.nextInt(maxWartosc+1000)+minWartosc;
        }
    }

    public static void wypisz(int[] tab)
    {
        for (int el : tab)
        {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

    public static int ileNieparzystych(int tab[], int n)
    {
        int nieparzyste = 0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]%2!=0)
            {
                nieparzyste++;
            }
        }
        return nieparzyste;
    }

    public static int ileParzystych(int tab[], int n)
    {
        int parzyste =0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]%2==0)
            {
                parzyste++;
            }
        }
        return parzyste;
    }

    public static int ileDodatnich(int tab[], int n)
    {
        int dodatnie = 0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]>0)
            {
                dodatnie++;
            }
        }
        return dodatnie;
    }

    public static int ileUjemnych(int tab[], int n)
    {
        int ujemne = 0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]<0)
            {
                ujemne++;
            }
        }
        return ujemne;
    }

    public static int ileZerowych(int tab[], int n)
    {
        int zerowe = 0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]==0)
            {
                zerowe++;
            }
        }
        return zerowe;
    }

    public static int ileMaksymalnych(int tab[], int n)
    {
        int max = 0;
        int ileMaxow = 1;
        for(int i=0; i<n; i++)
        {
            if(tab[i]>max)
            {
                max = tab[i];
            }
            else if(tab[i]==max)
            {
                ileMaxow++;
            }
        }

        return ileMaxow;
    }

    public static int sumaDodatnich(int tab[], int n)
    {
        int sumaDodatnich = 0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]>0)
            {
                sumaDodatnich = sumaDodatnich + tab[i];
            }
        }
        return sumaDodatnich;
    }

    public static int sumaUjemnych(int tab[], int n)
    {
        int sumaUjemnych = 0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]<0)
            {
                sumaUjemnych = sumaUjemnych + tab[i];
            }
        }
        return sumaUjemnych;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[], int n)
    {
        int dlugosc = 1;
        for(int i=0; i<n; i++)
        {
            if(tab[i]>0 && tab[i+1]>0)
            {
                dlugosc++;
            }
        }
        return dlugosc;
    }

    public static void signum(int tab[])
    {
        for(int i=0; i<10; i++)
        {
            if(tab[i]>=0)
            {
                tab[i] = 1;
            }
            if(tab[i]<0)
            {
                tab[i] = -1;
            }
        }
    }

    public static void odwrocFragment(int tab[], int lewy, int prawy, int n)
    {
        while(lewy < prawy)
        {
            int x = tab[lewy];
            tab[lewy] = tab[prawy];
            tab[prawy] = x;
            lewy++;
            prawy--;
        }
    }
}
*/

/*ZADANIE 3.*/
import java.util.Scanner;
import java.util.Random;


public class Cw3
{
    public static void main(String[] args)
    {
        System.out.println("Podaj liczby m,n,k: ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt();
        if(m<1 && m<11 && n<1 && n<11 && k<1 && k<11)
        {
            System.out.println("Podaj poprawna wartosc z zakresu [1:10]");
        }

    }

    public static void generuj(int tab[][], int n, int m, int minWartosc, int maxWartosc)
    {
        Random r = new Random();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                tab[i][j] = r.nextInt(maxWartosc+1000)+minWartosc;
            }

        }
    }

    public static void wypisz(int[][] tab)
    {
        for (int el : tab)
        {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

}
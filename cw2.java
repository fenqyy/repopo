/* Zadanie 1 a) - h)
import java.util.Scanner;

public class cw2 {
    public static void main(String[] args)
    {
        double suma = 0;
        double iloczyn = 1;
        double bezwzgledna = 0;
        double pierwiastek = 0;
        double iloczyn2 = 1;
        double sumapoteg = 0;
        double sumaciagu = 0;
        System.out.println("Podaj liczbę n: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++)
        {
            Scanner scan2 = new Scanner(System.in);
            double b = scan2.nextDouble();
            suma = suma + b;
            iloczyn = iloczyn * b;
            bezwzgledna = bezwzgledna + Math.abs(b);
            pierwiastek = pierwiastek + Math.sqrt(Math.abs(b));
            iloczyn2 = iloczyn2 * Math.abs(b);
            sumapoteg = sumapoteg + Math.pow(b, 2);
            sumaciagu = sumaciagu + (Math.pow(-1,i+1)*b);

        }

        System.out.println("Suma wynosi: " +suma);
        System.out.println("Iloczyn wynosi: "+iloczyn);
        System.out.println("Suma bezwzglednej wynosi: " +bezwzgledna);
        System.out.println("Suma pierwiastkow wynosi: " +pierwiastek);
        System.out.println("Iloczyn bezwzglednej wynosi: " +iloczyn2);
        System.out.println("Suma poteg wynosi: " +sumapoteg);
        System.out.println("Dwa działania: "+suma+ " oraz: " +iloczyn);
        System.out.println("Suma ciągu wynosi: "+sumaciagu);


    }
}
*/
/*
import java.util.Scanner;

public class cw2 {
    public static void main(String[] args)
    {
        double silnia = 1;
        double suma = 0;
        System.out.println("Podaj liczbę n: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(double j=a;j>1;j--)
        {
            silnia*=j;
        }
        for (int i = 1; i <= a; i++)
        {
            Scanner scan2 = new Scanner(System.in);
            double b = scan2.nextDouble();
            suma = suma + (Math.pow(-1,i)*b)/silnia;
            System.out.println(suma);
        }
        System.out.println(suma);
    }
}*/
/*
import java.util.Scanner;

public class cw2 {
    public static void main(String[] args)
    {
        System.out.println("Podaj liczbę n: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++)
        {
            Scanner scan2 = new Scanner(System.in);
            double b = scan2.nextDouble();

        }
    }
*/
/* Zadanie 2.2
import java.util.Scanner;

public class cw2
{
    public static void main(String[] args)
    {
        int suma = 0;
        System.out.println("Podaj liczbę n: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++)
        {
            Scanner scan2 = new Scanner(System.in);
            double b = scan2.nextDouble();
            if(b%2==0)
            {
                suma += (2*b);
            }
            else
            {
                suma += b;
            }

        }
        System.out.println(suma);
    }
}
*/
/* Zadanie 2.3
import java.util.Scanner;

public class cw2
{
    public static void main(String[] args)
    {
        int ujemne = 0;
        int zerowe = 0;
        int dodatnie = 0;
        System.out.println("Podaj liczbę n: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++)
        {
            Scanner scan2 = new Scanner(System.in);
            double b = scan2.nextDouble();
            if(b==0)
            {
                zerowe++;
            }
            if(b>0)
            {
                dodatnie++;
            }
            if(b<0)
            {
                ujemne++;
            }

        }

        System.out.println(ujemne);
        System.out.println(dodatnie);
        System.out.println(zerowe);
    }
}*/
/* Zadanie 2.4
import java.util.Scanner;

public class cw2
{
    public static void main(String[] args)
    {
        double max = 0;
        double min = 0;
        System.out.println("Podaj liczbę n: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++)
        {
            Scanner scan2 = new Scanner(System.in);
            double b = scan2.nextDouble();
            if(b>max)
            {
                max = b;
            }
            if(min>b)
            {
                min = b;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
} */

import java.util.Scanner;

public class cw2
{
    public static void main(String[] args)
    {
        int pary = 0;
        System.out.println("Podaj liczbę n: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double[] tab = new double[a];
        for (int i = 1; i <= a; i++)
        {
            Scanner scan2 = new Scanner(System.in);
            double b = scan2.nextDouble();
            tab[i] = b;
            if(tab[i]>0 && tab[i-1]>0)
            {
                pary++;
            }
        }
        System.out.println(pary);
    }
}





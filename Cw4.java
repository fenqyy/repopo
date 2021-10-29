import java.util.Scanner;


public class Cw4
{
    public static void main(String[] args)
    {
        System.out.println("Podaj napis oraz znak: ");
        Scanner scan = new Scanner(System.in);
        String napis = scan.next();
        String napis2 = scan.next();
        char znak = scan.next().charAt(0);
        System.out.println(znak);
        System.out.println(napis);
        System.out.println(countChar(napis, znak));
        System.out.println(countSubStr(napis,napis2));
        System.out.println(middle(napis));
        System.out.println(repeat(napis,3));
        System.out.println(where(napis,napis2));
    }

    public static int countChar(String str, char c)
    {
        int ile = 0;
        int i = str.indexOf(c);
        while(i >= 0)
        {
            i = str.indexOf(c, i+1);
            ile++;
        }
        return ile;
    }

    public static int countSubStr(String str, String subStr)
    {
        int ile = 0;
        int pozycja = 0;
        int i = str.indexOf(subStr);
        while(str.indexOf(subStr, pozycja) != -1)
        {
            ile++;
            pozycja += str.indexOf(subStr, pozycja) + subStr.length();
        }
        return ile;
    }

    public static String middle(String str)
    {
        int pozycja;
        int dlugosc;
        if(str.length()%2!=0)
        {
            pozycja = str.length()/2;
            dlugosc = 1;
        }
        else
        {
            pozycja = str.length()/2-1;
            dlugosc = 2;
        }
        return str.substring(pozycja, pozycja+dlugosc);

    }

    public static String repeat(String str, int n)
    {
        String powielony = str ;
        int i =0;
        while(i<=n)
        {
            powielony = str.concat(str).concat(str);
            i++;
        }
        return powielony;
    }

    public static int[] where(String str, String subStr)
    {
        int[] tab = new int[10];
        int pozycja = 0;
        int j = 0;
        int i = str.indexOf(subStr);
        while(str.indexOf(subStr, pozycja) != -1)
        {
            j++;
            i++;
            tab[j] = pozycja;
            pozycja += str.indexOf(subStr, pozycja) + subStr.length();
        }
        return tab;
    }

    public static String change(String str)
    {
        
    }
}

import java.util.Scanner;

public class Eveniment {
    public static void invitati ()
    {
        int invitati, $;
        System.out.print("Adaugati numarul de invitati=   \n ");
        Scanner inputDevice = new Scanner(System.in);
        inv = inputDevice.nextInt();
        $ = inv;
        pret($);
        System.out.print("Numarul  de invitati este = " + inv);

    }
    public static void pret ( int a2)
    {

        int p2 = a2 * 35;
        System.out.print("Pretul este  ");
        System.out.println(p2);
        System.out.print("Este un eveniment mare?");
        System.out.println(a2 > 50);
    }

    public static void nrevenimente ()
    {
        int numarevenimente;
        System.out.print("Adaugati numarul de Evenimente  \n ");
        Scanner inputDevice = new Scanner(System.in);
        numarevenimente = inputDevice.nextInt();
        for (int i = 1; i < numarevenimente; i++) {
            System.out.println(" \n Evenimentul " + i);
            invitati();

        }

    }
    public static void motto ()
    {

        System.out.print(" \n MOTTTTTTTTTTTOOOOOOOOOOO LAB 5 \n");
    }


}

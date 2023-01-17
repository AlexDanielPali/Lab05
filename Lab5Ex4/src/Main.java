import java.util.Scanner;
public class DeclarareMonstru {
    public static void main(String[] args) {
        Monstru unu=new Monstru();
        Monstru doi=new Monstru();
        unu = getData(unu);
        doi=getData(doi);
        System.out.println("Detaliile primului caracter monstru");
        System.out.println(unu.getChColor() + " " +unu.getName() + " " + unu.geteyes());
        System.out.println("Detaliile celui de al doilea caracter monstru );
        System.out.println(doi.getChColor()+" "+doi.geteyes()+ " "+ doi.getName());
    }

    public static Monstru getData(Monstru mn)
    {
        int eyes;
        String Name,Color;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Nume");
        Name=keyboard.nextLine();
        System.out.println("Culoare");
        Color=keyboard.nextLine();
        System.out.println("Numarul ochilor");
        eyes=keyboard.nextInt();
        mn.setName(Name);
        mn.setColor(Color);
        mn.seteyes(eyes);
        return mn;
    }


}

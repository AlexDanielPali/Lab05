import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Seashore one = new Seashore();
        one = getData(one);
        System.out.println("Datele evenimentului ");
        System.out.println("Numele eveninemtului = "+one.getNumarContract()+ " Orele "+one.getOreSiMinute() +"Pretul "+one.getpret()+ "ore "+one.getnumarOre());
    }


    public static Seashore getData(Seashore ss)
    {
        String nume;
        int ore;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Numele evenimentului");
        nume= keyboard.nextLine();
        System.out.println("numarul de minute");
        ore=keyboard.nextInt();
        ss.setNumarContract(nume);
        ss.setOreSiMinute(ore);
        return ss;
    }
}

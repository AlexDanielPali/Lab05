import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Catering one=new Catering();
        one=getData(one);
        System.out.print("Datele evenimentului ");
        System.out.println("Numele evenimentului este"+ one.NumeEveniment()+"Pretul per invitat este "+one.getGuests()+" ");
    }
    public static Catering getData(Catering ca)
    {
        int guest;
        String numeevent;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Numele evenimentului");
        numeevent= keyboard.nextLine();
        System.out.println("Numarul de invitati");
        guest=keyboard.nextInt();
        ca.setEventNumber(numeevent);
        ca.setGuests(guest);
        return ca;
    }
}
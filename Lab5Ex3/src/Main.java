import java.util.Scanner;
class DeclarareMonstru {
    public static void main(String[] args) {
        Monstru one = new Monstru();
        one = getData(one);
        System.out.println("Informatii despre monstru");
        System.out.println(one.getChCuloare() + " " + one.getName() + " " + one.getochi());
    }

    public static Monstru getData(Monstru mn) {
        int Ochi;
        String Nume, Culoare;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduceti numele");
        Nume = keyboard.nextLine();
        System.out.println("Introduceti culoarea");
        Culoare = keyboard.nextLine();
        System.out.println("Introduceti numarul de ochi");
        Ochi = keyboard.nextInt();
        mn.setNume(Nume);
        mn.setColor(Culoare);
        mn.setochi(Ochi);
        return mn;
    }
}

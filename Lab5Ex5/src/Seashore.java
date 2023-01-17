public class Seashore {
    final static int ora,rata;
    static{
        ora=60;
        rata=40;
    }
    private  String NumarContract;
    private int OreSiMinute;



    public void setNumarContract(String name)
    {
        NumarContract=name;

    }
    public void setOreSiMinute(int ss)
    {
        OreSiMinute=ss;
    }
    public String getNumarContract()
    {
        return NumarContract;
    }
    public int getOreSiMinute()
    {
        return OreSiMinute;
    }
    public int getpret()
    {
        int inchiriere = 0, inchiriereextra = 0, inchiereMeh;
        inchiriere = OreSiMinute * 40;
        if (inchiriere > 240) {
            for (int i = 60; i < OreSiMinute; i++) {
                inchiriereextra++;

            }
        }
        System.out.print("Pretul fara orele extra e ");
        System.out.println(inchiriere);

        System.out.print("Pretul minute suplimentare este ");
        System.out.println(inchiriereextra);


        inchiereMeh = inchiriere + inchiriereextra ;
        return inchiereMeh;

    }
    public int getnumarOre()
    {
        int timp;
        timp=OreSiMinute/ora;
        System.out.println("orele");
        return timp;
    }
}


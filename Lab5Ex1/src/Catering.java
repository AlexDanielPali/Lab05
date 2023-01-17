public class Catering {
    private int Guests;
    private String nume;
    private String EventNumber;

    final static int pret;
    static {
        pret=35;

    }
    public  void setEventNumber(String name)
    {
        EventNumber=name;
    }
    public  void setGuests(int ca)
    {
        if(Guests<50) {
            Guests = ca;
        }
    }
    public int getGuests()
    {
        return Guests*pret;
    }
    public String getEventNumber()
    {
        return EventNumber;
    }
    public void setNume(String name)
    {
        nume=name;
    }
    public String getNume()
    {
        return nume;
    }
}


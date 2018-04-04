public class Punkt {

    private int masa;        //prywatne pole masy

    public Punkt(){        //konstruktor domyślny
        this.masa=1;
    }

    public Punkt(int masa){       //konstruktor z parametrem
        setMasa(masa);
    }

    public int GMB(){          //Metoda obliczajaca glowny moment bezładnosci
        int i=0;
        return i;

        }

    public int MBS(int x){        //Metoda przyjmująca parametr obliczajaca moment bezwladności z tw. Steinera
        return GMB()+getMasa()*x*x;

    }

    public void opis(){         //Metoda zwracająca stały opis obiektu
        System.out.println("Punkt Materialny");
    }

    public void setMasa(int masa){          //mutator
        this.masa = masa;
    }

    public int getMasa(){           //akcesor
        return this.masa;
    }

}


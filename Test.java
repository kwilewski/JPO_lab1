public class Test{

    public static void main(String[] args){
        Punkt pkt1 = new Punkt();           //nowy obiekt z konstruktorem domyslnym
        Punkt pkt2 = new Punkt(10);         //nowy obiekt z konstruktorem z parametrem
        //wyswietlenie wartosci
        pkt1.opis();
        System.out.println("Masa: " + pkt1.getMasa());
        System.out.println("Moment glowny: " + pkt1.GMB());
        System.out.println("Moment z tw.Steinera(x=5): " + pkt1.MBS(5) + "\n");
        pkt2.opis();
        System.out.println("Masa: " + pkt2.getMasa());
        System.out.println("Moment glowny: " + pkt2.GMB());
        System.out.println("Moment z tw.Steinera(x=5): " + pkt2.MBS(5) + "\n");
        pkt1.setMasa(2);            //zmiana masy pkt1
        pkt1.opis();
        System.out.println("Masa: " + pkt1.getMasa());
        System.out.println("Moment glowny: " + pkt1.GMB());
        System.out.println("Moment z tw.Steinera(x=5): " + pkt1.MBS(5) + "\n");
        //tworzenie tablicy i wyswietlanie wartosci nowych obiektow
        Punkt tab[] = new Punkt[5];
        System.out.printf("Petla: \n\n");
        for(int i=0;i<5;i++){
            tab[i] = new Punkt(i+1);
            System.out.println("Masa: " + tab[i].getMasa());
            System.out.println("Moment glowny: " + tab[i].GMB());
            System.out.println("Moment z tw.Steinera(x=10):  "+ tab[i].MBS(10) + "\n");
        }
    }
}

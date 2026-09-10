package PaketInterface;

public class Hauptprogramm {

    public static void main(String[] args) {

        // Objekte erzeugen und ueber Setter befuellen (Kapselung)
        Rechteck re = new Rechteck();
        re.setLaenge(4);
        re.setBreite(5);
        re.berechneFlaeche();
        re.berechneUmfang();

        Kreis kr = new Kreis();
        kr.setRadius(3);
        kr.berechneFlaeche();
        kr.berechneUmfang();

        // Array vom Typ des INTERFACES -> Polymorphie!
        IObjekt2D[] objekte = {
            new Rechteck(2, 3),
            new Kreis(1.5)
        };

        for (IObjekt2D o : objekte) {
            System.out.println("------------------------------------");
            System.out.println("Flaeche: " + o.berechneFlaeche());
            System.out.println("Umfang:  " + o.berechneUmfang());
        }
    }
}

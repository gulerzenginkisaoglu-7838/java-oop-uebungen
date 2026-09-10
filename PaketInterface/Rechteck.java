package PaketInterface;

// Rechteck implementiert das Interface IObjekt2D.
// Zeigt Kapselung: die Attribute sind privat und nur ueber Setter/Getter zugaenglich.
public class Rechteck implements IObjekt2D {

    private double laenge;
    private double breite;

    public Rechteck() {
    }

    public Rechteck(double laenge, double breite) {
        setLaenge(laenge);
        setBreite(breite);
    }

    public void setLaenge(double laenge) {
        if (laenge < 0) {
            throw new IllegalArgumentException("Laenge darf nicht negativ sein.");
        }
        this.laenge = laenge;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setBreite(double breite) {
        if (breite < 0) {
            throw new IllegalArgumentException("Breite darf nicht negativ sein.");
        }
        this.breite = breite;
    }

    public double getBreite() {
        return breite;
    }

    @Override
    public double berechneFlaeche() {
        double flaeche = laenge * breite;
        System.out.println("Rechteck: Flaeche = " + flaeche);
        return flaeche;
    }

    @Override
    public double berechneUmfang() {
        double umfang = 2 * (laenge + breite);
        System.out.println("Rechteck: Umfang = " + umfang);
        return umfang;
    }
}

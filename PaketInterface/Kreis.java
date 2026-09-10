package PaketInterface;

// Kreis implementiert das Interface IObjekt2D.
// Zeigt Kapselung: der Radius ist privat und wird ueber Setter/Getter verwaltet.
public class Kreis implements IObjekt2D {

    private double radius;

    public Kreis() {
    }

    public Kreis(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius darf nicht negativ sein.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double berechneFlaeche() {
        double flaeche = Math.PI * radius * radius;
        System.out.println("Kreis: Flaeche = " + flaeche);
        return flaeche;
    }

    @Override
    public double berechneUmfang() {
        double umfang = 2 * Math.PI * radius;
        System.out.println("Kreis: Umfang = " + umfang);
        return umfang;
    }
}

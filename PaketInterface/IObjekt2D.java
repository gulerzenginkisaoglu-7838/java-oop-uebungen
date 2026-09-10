package PaketInterface;

// Interface fuer 2D-Objekte
// Definiert die gemeinsame Schnittstelle fuer alle geometrischen Flaechen.
public interface IObjekt2D {

    // Berechnet die Flaeche des Objekts.
    double berechneFlaeche();

    // Berechnet den Umfang des Objekts.
    double berechneUmfang();
}

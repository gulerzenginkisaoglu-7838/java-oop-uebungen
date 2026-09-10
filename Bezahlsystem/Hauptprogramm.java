package Bezahlsystem;

public class Hauptprogramm {
    public static void main(String[] args) {

        // Array vom Typ des INTERFACES -> Polymorphie!
        Zahlungsmethode[] zahlungen = {
            new Kreditkarte(),
            new PayPal("gueler@example.de")
        };

        double testbetrag = 49.99;

        for (Zahlungsmethode z : zahlungen) {
            System.out.println("------------------------------------");
            if (z.autorisieren(testbetrag)) {
                z.betragAbbuchen(testbetrag);
            } else {
                System.out.println("Zahlung abgebrochen.");
            }
        }
    }
}
package Bezahlsystem;

public class Kreditkarte implements Zahlungsmethode {

    @Override
    public boolean autorisieren(double betrag) {
        System.out.println("Kreditkarte: Pruefe Ablaufdatum...");
        System.out.println("Kreditkarte: Ablaufdatum gueltig. Autorisierung erfolgreich.");
        return true;
    }

    @Override
    public void betragAbbuchen(double betrag) {
        System.out.println("Kreditkarte: " + betrag + " Euro wurden abgebucht.");
    }
}
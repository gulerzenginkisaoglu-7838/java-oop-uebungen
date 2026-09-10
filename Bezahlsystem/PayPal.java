package Bezahlsystem;

public class PayPal implements Zahlungsmethode {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean autorisieren(double betrag) {
        System.out.println("PayPal: Pruefe E-Mail-Adresse '" + email + "'...");
        if (email.contains("@")) {
            System.out.println("PayPal: E-Mail gueltig. Autorisierung erfolgreich.");
            return true;
        } else {
            System.out.println("PayPal: E-Mail ungueltig! Autorisierung fehlgeschlagen.");
            return false;
        }
    }

    @Override
    public void betragAbbuchen(double betrag) {
        System.out.println("PayPal: " + betrag + " Euro wurden abgebucht.");
    }
}

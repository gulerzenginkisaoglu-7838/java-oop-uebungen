package Bezahlsystem;

public interface Zahlungsmethode {
    boolean autorisieren(double betrag);
    void betragAbbuchen(double betrag);
}

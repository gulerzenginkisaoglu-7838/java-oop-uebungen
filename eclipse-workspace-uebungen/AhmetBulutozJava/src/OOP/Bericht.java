package OOP;

public class Bericht {

	private double verkaufssumme;

	public void setVerkaufsbetrag(double verkaufsbetrag) {
		this.verkaufssumme = verkaufsbetrag;
	}

	public double getVerkaufssumme() {
		return verkaufssumme;
	}

	public static void main(String[] args) {
		Bericht bericht = new Bericht();
		bericht.setVerkaufsbetrag(100);

		System.out.println(bericht.verkaufssumme);
	}
}

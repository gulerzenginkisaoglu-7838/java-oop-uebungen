package aufgabe1;
 
import java.util.Scanner;
 
public class ZahlenRaten {
 
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Zufallszahl zwischen 1 und 10

		int geheimnis = (int)(Math.random() * 10) + 1;

		//Scanner

		Scanner tastatur = new Scanner(System.in);

		System.out.println("Hallo, wir raten eine Zahl...");

		System.out.print("...eine Zahl zwischen 1 und 10 eingebn: ");


		//Zahl einlesen

		int tipp = tastatur.nextInt();

		//prüfen, ob Zahl stimmt

		if (tipp == geheimnis) {

			System.out.println("Perfekt, Zahl ist erraten");

		}else {

			System.out.println("...leider nicht. Die Zahl war " + geheimnis);

		}

		//Scanner wieder schliessen

		tastatur.close();

	}
 
}

 

package OOP;

public class ogenciIsleri {

	public static void main(String[] args) {
		Ogrenci ogr1=new Ogrenci();
		ogr1.isim="Hasan";
		System.out.println(ogr1.isim);      // Hasan
		
		Ogrenci ogr2=new Ogrenci();
		ogr2.setSoyisim("Kalem");
		System.out.println(ogr2.getSoyisim());      // Hasan
		
	}
}

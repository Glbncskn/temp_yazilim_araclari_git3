package tr.edu.medipol.yazilimaraclari.spring_boot_ornek2;

import java.util.ArrayList;
import java.util.List;

public class OgrenciVeriServisi {

	private static final List<Ogrenci> OGRENCILER = new ArrayList<>();
	static {
			OGRENCILER.add(new Ogrenci("Joe Doe", "H1234567890"));
			OGRENCILER.add(new Ogrenci("Jane Doe", "H1234567891"));
			OGRENCILER.add(new Ogrenci("Ali Doe", "H1234567892"));
			OGRENCILER.add(new Ogrenci("Kamil Doe", "H1234567893"));
			OGRENCILER.add(new Ogrenci("Fatma Doe", "H1234567894"));
			OGRENCILER.add(new Ogrenci("Serap Doe", "H1234567895"));
			OGRENCILER.add(new Ogrenci("Halil Doe", "H1234567896"));
			
	}
		
	

	public static List<Ogrenci> ogrencileriGetir(){
		return OGRENCILER;
	}
	public  static void ogrenciEkle(Ogrenci ogrenci) {
		OGRENCILER.add(ogrenci);
	}
		
}

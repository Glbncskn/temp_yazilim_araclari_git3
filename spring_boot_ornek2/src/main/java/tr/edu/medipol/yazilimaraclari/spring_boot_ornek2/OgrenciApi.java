package tr.edu.medipol.yazilimaraclari.spring_boot_ornek2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciApi {
	
	@GetMapping("/listele")
	public List<Ogrenci> listele(){
		return OgrenciVeriServisi.ogrencileriGetir();		
	}
	
	@PostMapping("/ekle")
	public Ogrenci ekle (@RequestBody Ogrenci ogrenci) {
		OgrenciVeriServisi.ogrenciEkle(ogrenci);
		return ogrenci;
	}
	@GetMapping("/ekle2")
	public Ogrenci ogrenciEkle(
			@RequestParam String isim, 
			@RequestParam String numara) {
		Ogrenci ogrenci = new Ogrenci (isim, numara);
		OgrenciVeriServisi.ogrenciEkle(ogrenci);
		return ogrenci;
	}
	
}

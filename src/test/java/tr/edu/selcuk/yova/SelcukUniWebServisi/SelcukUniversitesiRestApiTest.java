package tr.edu.selcuk.yova.SelcukUniWebServisi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;

public class SelcukUniversitesiRestApiTest {

	SelcukUniversitesiRestApi selcukUniversitesiRestApi = new SelcukUniversitesiRestApi();
    private static List<String> dersadi = SelcukUniversitesiRestApi.dersadi;

    @Test
    public void Listele() {
        List<String> sonuc = SelcukUniversitesiRestApi.listele();
        assertEquals(dersadi,sonuc);
    }

    @Test
    public void Ekle() {
        String ders = "Türkçe";
        String sonuc = SelcukUniversitesiRestApi.ekle(ders);
        assertEquals("Türkçe",sonuc);
    }

    @Test
    public void Sil() {
        String ders = "Matematik";
        SelcukUniversitesiRestApi.dersadi.add(ders);
        String sonuc = SelcukUniversitesiRestApi.sil(ders);
        assertEquals("Matematik",sonuc);
    }
		
		
	}

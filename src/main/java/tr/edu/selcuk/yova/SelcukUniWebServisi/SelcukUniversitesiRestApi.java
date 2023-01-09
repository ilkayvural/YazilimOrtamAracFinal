package tr.edu.selcuk.yova.SelcukUniWebServisi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/dersislemleri")


public class SelcukUniversitesiRestApi {

	
	public static List<String> dersadi = new ArrayList<>();
	
	
	{
		dersadi.add("Matematik");
		dersadi.add("Fizik");
	}
	
	

    @GetMapping("/listele")
    public static List<String> listele(){
        return dersadi;
        
        
        
    }
    
    @PostMapping("/sil")
    public static String sil(@RequestBody String ders) {
    	dersadi.remove(ders);
        return ders;
  
    } 
    
    
    @PostMapping("/ekle")
    public static String ekle(@RequestBody String ders) {
	dersadi.add(ders);
    return ders;
    }


    }


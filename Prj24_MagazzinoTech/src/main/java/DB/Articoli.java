package DB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Articolo;

public class Articoli {
	
	private static Map<Integer, Articolo> ALL = new HashMap<>();

	
	static {
		
	String[] tech= {
			"Monitor" , "Telefoni", "mouse", "tastiera", "cuffie","computer","case", "stampante",
			"scanner"};
		
		for (String art : tech) {
			Articolo a= new Articolo(art,100);//costruzione di un articolo
			ALL.put(a.getId(), a);// inserisco l'articolo in uno stesso contenitore di articoli
		}
		
		
		
		
		
	}
	public static Map<Integer, Articolo> getALL() {
		return ALL;
	}
	
	
	
	
}

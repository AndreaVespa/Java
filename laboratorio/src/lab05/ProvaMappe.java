package lab05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProvaMappe {

	public static void main(String[] args) {
	
		//  Set     List
		Map<String, String> capoluoghi = new HashMap<>();
		
		capoluoghi.put("piemonte", "torino");
		capoluoghi.put("lombardia", "milano");
		capoluoghi.put("lazio", "roma");
		
		Set<String> keySet = capoluoghi.keySet(); // l'ho messo dentro un set di stringhe
		
		for (String regione : keySet) {
			System.out.println(regione);
			System.out.println(capoluoghi.get(regione));
		}
	}

}

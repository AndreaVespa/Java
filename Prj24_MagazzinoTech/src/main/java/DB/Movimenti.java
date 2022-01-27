package DB;

import java.util.ArrayList;
import java.util.List;

import model.Movimento;

public class Movimenti {

private static	List<Movimento> ALL= new ArrayList<>();


public static List<Movimento> getALL() {
	return ALL;
}
	public static void addMovimento(Movimento m) {
		if (m.getQuantita()<0 && Articoli.getALL().get(m.getArticolo().getId()).getQuantita()>Math.abs(m.getQuantita())      ) {
			System.out.println("Disponibilità termonata");
		}else {
			
			ALL.add(m);
			// devo andare a caricare e scaricare il contenitore
			Articoli.getALL().get(m.getArticolo().getId()).setQuantita(m.getQuantita());
			
		}
		
		
		
		
	}
	
	
	
	
}

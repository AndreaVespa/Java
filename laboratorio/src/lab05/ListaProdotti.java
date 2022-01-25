package lab05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class OrdinaPrezzoAsc implements Comparator<Prodotto>{

	@Override
	public int compare(Prodotto o1, Prodotto o2) {
	double diff = o1.prezzo -o2.prezzo;
	
	if(diff > 0) {
		return 1;
		
	}else if (diff <0) {
		return -1;
	}
	
	
	
		return 0;
	}
	
}

public class ListaProdotti {

	public static void main(String[] args) {


		List<Prodotto> prodottiList = new ArrayList<>();
		
		
		prodottiList.add(new Prodotto("pigiama" , 10, 3));
		prodottiList.add(new Prodotto("maglietta" , 12, 2));
		prodottiList.add(new Prodotto("pantaloni" , 8, 8));
		prodottiList.add(new Prodotto("giacca" , 80, 5));
		prodottiList.add(new Prodotto("cappotto" , 74, 9));
		
	Collections.sort(prodottiList);
	
	Collections.sort(prodottiList, (o1,o2) ->o2.colpodifulmine - o1.colpodifulmine);

		
	
	
	
	
	
	prodottiList.forEach(p-> System.out.println(p)); //la freccia è chiamata lambda
		
	
	
	}


}
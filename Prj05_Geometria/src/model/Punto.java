package model;

public class Punto {
	
	int x;//0
	int y;//0
	
	// costruttore senza argomenti
	public Punto() {
		this.x = 0;
		this.y= 0;
	}
	
	
	//
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}


/**
 * 
 * @return Ritorna la stringa che rappresenta questo punto p.es (5, 4)
 */ 
	public String stampaPunto () {
		return "("+ x +","+ y +")";// 
	}
	

}

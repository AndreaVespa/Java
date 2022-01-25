package model;

public class Dado {
	// modificatori di accesso : public, private, niente ( visibilità di package)
	 private int facce;//
	 private String colore; // sono proprietà
	
	public Dado() {
		this.facce=6;
		this.colore= "bianco";
	} // costruttore di default, inizia per lettera maiuscola si deve chimare come l'oggetto che costruisci ovvero la classe () seguito da coppia di tonde è un metodo
	
	public Dado(int facce , String colore) { // new Dado(6, " bianco");
		this.facce=facce;// con this identifico quale oggetto con lo stesso nome
		this.colore=colore;
		
	}
	
public int lancia() {
	double casuale = Math.random();//val casuale tra (0.0 <1.0) 
	//6 faccie 1-6    casuale * n.facce) +1 e ottengo un numero da 1-6 
	int res =(int)(Math.random() *  facce )+ 1; // int tra due parentesi forza il passaggio da double a int
	
	return res;
} 
}

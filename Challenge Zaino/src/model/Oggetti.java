package model;

public class Oggetti {

	private String descrizione;
	private double peso;
	
	
	public Dono(String descrizione, double peso) {
	
		
		this.descrizione = descrizione;
		this.peso = peso;
	}
	
	public String Cosa() {
		
		return this.descrizione +" " +this.peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	
	
}


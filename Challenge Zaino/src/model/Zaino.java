package model;

public class Zaino {
 
	private int id;
	private Oggetti[] oggetti;
	
	public Zaino (int id) {
		
		this.id= id;
		this.oggetti = new Oggetti[10];
		
	}
	public int getId() {
		return id;
	}
	public Oggetti[] getOggetti() {
		return oggetti;
		
	}
	public String Cosa() {
		String Cosa="";
	}
	
	
	
	
	
}
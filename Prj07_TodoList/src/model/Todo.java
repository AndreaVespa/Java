package model;

public class Todo {
	
	private String descrizione;
	private boolean completo;// risponde a è vero o falso
	
	
	public Todo(String descrizione) {
		
		this.descrizione = descrizione; // avrà la descrizione di ogni to do es new Todo("pane")
		this.completo = false;
	}

	//getters permtettono di ottenere il valore della proprietà

	public String getDescrizione() {
		return descrizione.toUpperCase();
	}


	public void setDescrizione(String descrizione) {
		
		this.descrizione = descrizione;
	}


	public boolean isCompleto() {
		return completo;
	}


	public void setCompleto(boolean completo) {
		this.completo = completo;
	}
	
	
	

}

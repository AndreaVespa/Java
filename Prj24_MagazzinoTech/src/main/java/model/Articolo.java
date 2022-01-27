package model;

public class Articolo implements Comparable<Articolo> {

	private int id;
	private String descrizione;
	private static int counter=0;
	private int quantita;
	
	public Articolo(String descrizione, int quantita) {
	
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.id=counter++;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Articolo [id=");
		builder.append(id);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append(", quantita=");
		builder.append(quantita);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Articolo o) {
	
		return this.id- o.id;// mi confronta gli articoli
	}
	
	
	
	
}

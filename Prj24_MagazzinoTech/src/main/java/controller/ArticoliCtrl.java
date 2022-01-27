package controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import model.Articolo;

public class ArticoliCtrl {

	private Map<Integer, Articolo> articoliMap;
	private Set<Articolo>articoliSet;
	private List<Articolo>articoliList;
	
	
	public ArticoliCtrl() {
		this.articoliMap = new HashMap<Integer, Articolo>();
		this.articoliSet = new TreeSet<Articolo>();
		this.articoliList = new LinkedList<Articolo>();
		
	}

	public Map<Integer, Articolo> getArticoliMap() {
		return articoliMap;
	}

	public Set<Articolo> getArticoliSet() {
		return articoliSet;
	}

	public List<Articolo> getArticoliList() {
		return articoliList;
	}
	
	public void addArticolo(Articolo a) {
		this.articoliList.add(a);
		this.articoliSet.add(a);
		this.articoliMap.put(a.getId(),a);// mi prende l'articolo con id corrispondente senza scorrere tuta la lista
	}
	
	public Articolo getArticolo(int i) {// passo id dell'articolo
			
		return  this.articoliMap.get(i); // qua prendo l'ggetto indipendentemente dal contenitore in cui è
	}
	
	
	
	
	
	
}

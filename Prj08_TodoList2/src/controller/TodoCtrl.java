package controller;

import java.util.ArrayList;

import model.Todo;

public class TodoCtrl {

	private Todo[] spesa;
	
	private ArrayList<Todo> lista ;
	
	
	
	
	public TodoCtrl() {
		System.out.println("hai costrutio un controller");
		//this.spesa = new Todo[10];
		this.lista = new ArrayList<Todo>();
		
		
	}
	
	public void addTodo(String desc, int pos) {
		
		Todo temp = new Todo(desc);
		//this.spesa[pos] = temp;
		this.lista.add(temp);// aggiunge il todo alla fine della loista
		
		
		
		
	}
	
	
	public void stampaLista() { //scrorre la lista di Todo e se ce lo stampa
		
		for (int i = 0; i < lista.size(); i++){
			
			
			if (lista.get(i) != null) {
				
				if (lista.get(i).isCompleto())
				System.out.println("[*]");
				else
					
					System.out.println("[ ]");
					
			
				System.out.println(lista.get(i).getDescrizione());
			}
			
			
			
			
			
		}
	}
	
	
	public void completa(int pos) {
		
		if (this.lista.get(pos) != null) {
			this.lista.get(pos).setCompleto(true);
			
			
		}
		
	}
	
	
}

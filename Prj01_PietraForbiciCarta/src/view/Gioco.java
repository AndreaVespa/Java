package view;// raccolte di classi

import java.util.Scanner;

public class Gioco {

	public static void main(String[] args) {
		
		String sceltaUmano ="";// string è una classe
		String sceltaPc ="";  
		
		String risultato ="";
		
		for (int i = 0; i <5; i++) {// ciclo che ripete 5 volte le istruzioni
			sceltaPc = sceltaCasualePC();
			sceltaUmano = sceltaUmano();
			risultato= valutaScelte(sceltaPc, sceltaUmano);
			System.out.println("Il valore di i è: " +i);
		
		
			

	}//chiusura for

	}//chiusura main
	private static String valutaScelte(String sceltaPc, String sceltaUmano) {
		
		String res="";
		
if (sceltaUmano.equals(sceltaPc)){
			res ="pareggio";
} // equals= è un metodo che verifica se una stringa è uguale ad un altra stringa
			
			
	 else {
		 if (sceltaUmano.equals("pietra")) {
			 if(sceltaPc.equals("forbici")) {
				 res = "vince umano";
			 }
		 }
		System.out.println("non pareggio");
	 }// chiusura else
		return null;
	}
	private static String sceltaUmano() {
		System.out.println("scegli tra p: pietra, f: forbici, c: carta");
		Scanner input = new Scanner(System.in);// metodo costruttore dell'oggetto di tipo scanner
		
		String risposta = input.nextLine();		
		
		return risposta;
	}
	public static 	String sceltaCasualePC() {
		
		String scelta="";
		
	double casuale = Math.random();// un numero reale casuale compreso tra 0.0 e minore di 1.0
		
	if(casuale < 0.33) {
		scelta ="pietra";
	} else if (casuale < 0.66){
		scelta ="forbici";
	} else {
	scelta ="carta";
		
	}
		return scelta;
	}
}
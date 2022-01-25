package view;
import java.util.Scanner;

import controller.OggettiCtrl;

public class interfacciaZaino {
	private Scanner scanner;
	private OggettiCtrl controller;
	
	public static void main(String[] args) {
 interfacciaZaino lo = new interfacciaZaino();
 boolean continua = true;
 while (continua) {
	 
 lo.stampaLista();
 
 int scelta= lo.leggiSceltaUtente();
 switch (scelta) {
 
	case 1:
		if (scelta == 1) {
			System.out.println("Per aggiungere un nuovo oggetto, inserisci una parola");
			String desc = lo.scanner.next();
			System.out.println("inserisci la posizione della nota");
			int pos = lo.scanner.nextInt();

			lo.controller.(desc, pos);

		}
 
 
 
 
 
 
 
 }
 
 
 
 
 
 }
 
 }
	private int leggiSceltaUtente() {

		System.out.println();
		

	}
	
private void stampaLista() {
	
	
	
	System.out.println("Aggiungi oggetto");
	
	System.out.println("Aggiungi zaino");
	System.out.println("Stampa ListaPeso");
	System.out.println("Esci");
}
}

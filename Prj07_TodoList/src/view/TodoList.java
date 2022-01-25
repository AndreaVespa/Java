package view;

import java.util.Scanner;

import controller.TodoCtrl;

public class TodoList {

	private Scanner scanner;
	private TodoCtrl controller;

	public TodoList() {
		this.scanner = new Scanner(System.in);
		this.controller = new TodoCtrl();

	}

	public static void main(String[] args) {

		TodoList tl = new TodoList();

		boolean continua = true;

		while (continua) {

			tl.stampaMenu();

			int scelta = tl.leggiSceltaUtente();
			switch (scelta) {

			case 1:
				if (scelta == 1) {
					System.out.println("Per aggiungere un nuovo todo, inserisci una stringa descrizione");
					String desc = tl.scanner.next();
					System.out.println("inserisci la posizione della nota");
					int pos = tl.scanner.nextInt();

					tl.controller.addTodo(desc, pos);

				}

				break;

			case 2:
				if (scelta == 2) {
					System.out.println("Per completare un todo, scrivi numero intero del todo");
					int pos = tl.scanner.nextInt();
					tl.controller.completa(pos);
					
				}
				break;
			case 3:
				if (scelta == 3) {
					System.out.println("scelta 3");
				}
				break;
			case 0:
				if (scelta == 0) {
					continua = false;
					System.out.println("scelta 0");
				}
				break;

			}
		}

 	}

	tl.controller.addTodo("pane",0);
	tl.controller.addTodo("vino",1);
	tl.controller.addTodo("acqua",2);
	tl.controller.addTodo("biscotti",3);

	tl.controller.completa(1);

	tl.controller.stampaLista(){

	}

	private int leggiSceltaUtente() {

		System.out.println();

	}

	private void stampaMenu() {
		System.out.println("1) Agiungi todo");
		System.out.println("2) Completa todo");
		System.out.println("3) Stampa todo");
		System.out.println("0) Esci");

	}

}

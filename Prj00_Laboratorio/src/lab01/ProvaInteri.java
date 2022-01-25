package lab01;

public class ProvaInteri {
	 int a, b;

	public static void main(String[] args) { //il main fa partire il programma, static appartiene alla classe
		
		
		int a; //locali si vedono solo in main sono prigioniere del main
		int b;
		
		
		a = 4;// inizializzazione
		b= 4;// è una variabile posso cambiare valore
		
		final int RIGHE = 10;
		final int COLONNE= 10;
		
		for (int i = 1; i <= RIGHE ; i++) {
			
			for (int j = 1; j <= COLONNE ; j++) {
				System.out.print(i*j + "\t");//\t = tabulazione
				
			}
			
			System.out.println();
			//innestare un secondo ciclo for
			
		
		}
		
		
		
		if (a==b) {// tra tipi primitivi con == confronto il valore
			System.out.println("a e b sono uguali");
		}else {
			System.out.println("a e b sono diversi");
		}
		
		
		
		
		
		
		
		
		

	}

}

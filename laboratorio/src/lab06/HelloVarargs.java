package lab06;

public class HelloVarargs {

	public static void main(String[] args) {

		System.out.println(calcolaMedia(26,24,28));
		System.out.println(calcolaMedia(26,24,28,30));
		System.out.println(calcolaMedia(26,24,28,30,32,34));
		System.out.println(calcolaMedia(26,24,28,30,32,34,36));
		
		
		
		
		
	}
	
	private static double calcolaMedia(int... voti) {
		double totale = 0 , media =0;
		for (int i : voti) {
		totale += i;	
		}
		
		
		media=totale/voti.length;
		return media;
		
	}
	
	

}

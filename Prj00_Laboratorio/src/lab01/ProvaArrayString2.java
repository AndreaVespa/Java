package lab01;

import java.util.Arrays;

public class ProvaArrayString2 {

	public static void main(String[] args) {
		int lung = 7;
	
		String [] nani = {
				"pisolo",
				"gongolo",
				"cucciolo",
				"mammolo",
				"eolo",
				"dotto",
				"brontolo",
		};
		
	    
	    int lunghezza = nani.length;// proprietÓ
	    
	    Arrays.sort( nani);
	    
	    
	    for (int i = 0; i < nani.length; i++) {
	    	
	    	if (nani[i].length() > 5)
	    	System.out.println(nani[i]);
			
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

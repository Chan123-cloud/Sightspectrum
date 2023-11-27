package JavaPrograms3;

public class LinearSearch {

	public static void main(String[] args) {
		int b[] = {12,56,34,89,345,45};
		int search =45 ;
		boolean c = false;
	for(int i =0 ; i<b.length ; i++) {
		
		if(b[i] == search) { 
	    System.out.println("ELEMENT IS PRESENT"+ i);
	    c=true;
	    break;
		  
		}
	}
			
	if(c==false)
	      System.out.println("ELEMENT NOT FOUND");
	}
}

		


	



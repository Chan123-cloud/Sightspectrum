package Javaprograms2;

public class EvenandOddinArray {

	public static void main(String[] args) {
		
	int b[] = {12,345,23,2321,897,4675,4,22};
	
	System.out.println("Even numbers are");
	
	for(int i = 0 ; i<b.length; i++) {
		if(b[i] %2 ==0) {
			System.out.println(b[i]);
		}
	}
		System.out.println("Odd numbers are");
		for(int i = 0 ; i<b.length; i++) {
		if(b[i]%2 !=0){
			System.out.println(b[i]);
		}
		
	}

	}

}

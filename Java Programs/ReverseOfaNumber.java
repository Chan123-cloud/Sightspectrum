package JavaPrograms;

public class ReverseOfaNumber {
	
	public static void main (String [] args) {

		int n = 232 , rev = 0 ;

		while(n>0) {

		rev = rev *10 ;

		rev = rev + n%10 ;

		 n = n/10 ;

		}

		System.out.print(rev);

		}

		}




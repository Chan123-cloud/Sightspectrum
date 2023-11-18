package JavaPrograms;

public class PalindromeOfaNumber {
	
	public static void main (String [] args) {

		int n = 232 , rev = 0 ;
		
		int temp = n;

		while(n>0) {

		rev = rev *10 ;

		rev = rev + n%10 ;

		 n = n/10 ;
}
		if (temp == rev) {

		System.out.println("Palindrome ");
}

		else {

		System.out.println("Not a Palindrome");
}}}




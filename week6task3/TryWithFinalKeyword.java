package week6task3;

import java.util.Scanner;

public class TryWithFinalKeyword {

	public static void main(String[] args) {
		Scanner a=null;
		try {
			
			 a = new Scanner(System.in);
			 System.out.println("Enter the character");
			 char c = a.next().charAt(0);
			 System.out.println(c);
		
		}
		finally{
			a.close();
		}
		

	

}
}

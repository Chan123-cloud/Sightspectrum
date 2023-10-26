package week8task2;

import java.io.File;
import java.util.Scanner;
public class fileRead {

	public static void main(String[] args) {
		try {
			File k = new File("C:\\java\\detials.txt");
			Scanner sc = new Scanner(k);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
				
			catch(Exception e) {
				System.out.println("Error occured");
			}
			

	}

}

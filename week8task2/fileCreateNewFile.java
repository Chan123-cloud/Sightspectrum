package week8task2;

import java.io.File;

public class fileCreateNewFile {

		public static void main(String[] args) {
			try {
			File k = new File("C:\\java\\detials.txt");
			
			if(k.createNewFile()) {
				System.out.println("file created");
				}
			else {
				System.out.println("File Exsist");
			}
			
			}
			catch(Exception e) {
				System.out.println("Error occured");
			}
			
			
		}
}

	

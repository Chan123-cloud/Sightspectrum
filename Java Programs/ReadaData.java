package JavaPrograms3;
import java.io.File;
import java.util.Scanner;

public class ReadaData {

	public static void main(String[] args) {
		try {
		File a = new File("C:\\java\\detials.txt");
		Scanner sc = new Scanner(a);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		}
		catch(Exception A) {
			System.out.println("Error occured");
		}
		
}
}

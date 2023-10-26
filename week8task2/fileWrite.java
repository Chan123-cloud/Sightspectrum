package week8task2;
import java.io.FileWriter;
public class fileWrite {

	public static void main(String[] args) {
		try {
		
		FileWriter s = new FileWriter("C:\\java\\detials.txt");
		s.write("Dont worry Be happy");
		s.close();
		System.out.println("Writted Successfully");
	}
		catch(Exception E) {
			System.out.println("error occured");
		}
		

}
}

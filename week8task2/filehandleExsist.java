package week8task2;
import java.io.File;
public class filehandleExsist {

	public static void main(String[] args) {
		File f = new File("C:\\java");
		if(f.exists()) {
			System.out.println("file Exsist");
			}
		else {
			System.out.println("File doesnot exsist");
		}
		
	}

}

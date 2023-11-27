package JavaPrograms3;

import java.io.FileWriter;

public class WriteaData {

	public static void main(String[] args) {
		try {
        FileWriter a = new FileWriter("C:\\java\\detials.txt");
        a.write("NOW GOING TO LEARN SPRINGBOOT");
        a.close();
        System.out.println("WROTED");
     }
	   catch(Exception E) {
		   System.out.println("ERROR OCCURED");
	   }

}
}

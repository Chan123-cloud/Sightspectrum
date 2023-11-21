package JavaPrograms1;
import java.util.Random;
public class GenerateRandomData {

	public static void main(String[] args) {
		
		Random a = new Random();
		int v = a.nextInt(5); // Prints 0 to 5 random number // 0 to 999 for Integer
		System.out.println(v);
		
		
		double d = a.nextDouble() ;  // Range from 0.0 to 1.0
        System.out.println(d);  

	}

}

package week8task1;
import java.util.Arrays;
import java.util.stream.*;
public class Reduce {

	public static void main(String[] args) {
		String[] myArray = { "Chandra" ,"Kumar" ,"M"};
		Stream<String> d = Arrays.stream(myArray);
		String e = d.reduce("",(a,b)-> a+b);
		System.out.println(e);

	}

}

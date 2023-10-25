package week8task1;
import java.util.Arrays;
import java.util.stream.*;
public class Map {

	public static void main(String[] args) {
		String s[]= {"APPLE","MANGO","PINNAPLE"};
		Stream<String> a = Arrays.stream(s);
		Stream <String> b = a.map(d-> d.toLowerCase()); // 
		String w[] = b.toArray(String[] ::new); // Stream to array
		System.out.println(Arrays.toString(w));  // Arrays to string
	}

}

package week8task1;
import java.util.List;
import java.util.stream.*;
import java.util.Arrays;
public class Filter {

	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(123,2123,343,3312); // by using ArrayList
		Stream<Integer> a = s.stream();
		Stream<Integer> b = a.filter(f-> f%2!=0);
		b.forEach(f-> System.out.println(f));  // For each method
		
		

	}

}

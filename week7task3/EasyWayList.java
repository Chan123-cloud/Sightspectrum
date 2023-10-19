package week7task3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class EasyWayList {

	public static void main(String[] args) {
	List<String> a = Arrays.asList("Anand", "kishore");
	System.out.println(a);
	for(int i = 0 ; i<a.size() ; i++) {
		System.out.println(a.get(i));  // for loop method
	}
	for(String s:a) {
		System.out.println(s);  //  Enhanced for loop
	}
	a.forEach(s->System.out.println(s));   //For each loop

	}


}

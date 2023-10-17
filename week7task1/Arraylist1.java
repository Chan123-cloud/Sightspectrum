package week7task1;
import java.util.ArrayList;
public class Arraylist1 {

	public static void main(String[] args) {
	ArrayList a = new ArrayList();
	ArrayList b = new ArrayList();
	a.add("chandra kumar");
	a.add("Suresh kumar");
	a.add("rajesh");
	System.out.println(a);
	b.add("chandra kumar");
	b.add("Suresh kumar");
	a.retainAll(b);
	System.out.println(a);
	System.out.println(b);
	
	

	}

}

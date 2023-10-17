package week7task1;
import java.util.ArrayList;
public class Arraylist {
public static void main(String[] args) {
		ArrayList<Integer>a = new ArrayList<Integer>();
		ArrayList<Integer>b= new ArrayList<Integer>();
		for(int i =1; i<=10; i++) {
			a.add(i);
			b.add(i);
		}
	System.out.println(a);
    System.out.println(a.clone());
 	System.out.println(a.contains(10));
	System.out.println(a.containsAll(b));
	System.out.println(a.hashCode());
	System.out.println(a.indexOf(5));
	System.out.println(a.get(6));
	a.set(2,234);
	System.out.println(a);
	System.out.println(a.lastIndexOf(26));
	b.remove(4);
	System.out.println(b);
	System.out.println(a.size());
	a.retainAll(b);
	System.out.println(a);
	System.out.println(b);
}
}

package week7task1;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<Double> b = new LinkedHashSet<Double>();
		b.add(123.456);
		b.add(57.324234);
		b.add(123.456);
		b.add(123.456);
		System.out.println(b);
		Iterator <Double> i = b.iterator();  //iterator
		while(i.hasNext()) {  // check till the last condition
			System.out.println("The values are :"+i.next());  // print 1 data in list
		}
	}

}

package week7task2;
import java.util.HashMap;
import java.util.Map;
public class Hashmap {

	public static void main(String[] args) {
		Map<Character,Integer> a = new HashMap<Character,Integer>();
		Map<Character,Integer> b= new HashMap<Character,Integer>();
		a.put('Z', 234);
		a.put('E', 45);
		a.put('v', 45);
		//a.put('c',231 );
		b.put('d', 7);
		
		System.out.println(a);
		System.out.println(b);
		b.putAll(a);
		System.out.println(b);
        a.clear();
		System.out.println(a);
		System.out.println(a.containsKey('c'));
		System.out.println(b.containsValue(7));
		System.out.println(a.equals(b));
		System.out.println(b.isEmpty());
		System.out.println(b.size());
		b.replace('c', 45, 54);
		System.out.println(b);
	    b.remove('c');
	    System.out.println(b);
}

}

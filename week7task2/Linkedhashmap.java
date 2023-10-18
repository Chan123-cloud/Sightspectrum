package week7task2;
import java.util.LinkedHashMap;
import java.util.Map;
public class Linkedhashmap {

	public static void main(String[] args) {
	Map<String,Integer> c = new LinkedHashMap<String,Integer>();
	 c.put("chan", 1);
	 c.put("mohan", 2);
	 c.put("ravi", 45);
	 c.put("livin",123);
	 c.put("chan", 2);
	 System.out.println(c);
		
	}

}

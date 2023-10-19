package week7task3;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> c = Arrays.asList(12,45,345,23,3423,2321);
		Stream<Integer> s = c.stream();
	    Stream<Integer> r = s.filter(v->v%2==0); 
        Stream<Integer> t = s.map(v->v*2);
        int res = t.reduce(0, (j,g)->j+g);
        System.out.println(res);
      //  r.forEach(v->System.out.println(v));
	    
    
	}

}

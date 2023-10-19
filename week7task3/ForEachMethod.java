package week7task3;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
public class ForEachMethod {

	public static void main(String[] args) {
		List<Integer> c = Arrays.asList(143,265,397);
		Consumer<Integer> co = new Consumer<Integer>() {
			public void accept(Integer w) {
				System.out.println(w*2);
			}
			
		};
		
      c.forEach(co);
	}

}

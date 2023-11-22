package Javaprograms2;
import java.util.Arrays;
public class EqualityofanArray {

	public static void main(String[] args) {
		int a[] = {123,456,789};
		int b[] = {456,123,789};
		Arrays.sort(a);
		Arrays.sort(b);
		boolean  d = Arrays.equals(a, b);
		if(d == true) {
		System.out.println("Arrays are Equal");
				}
				else {
					System.out.println("Arrays are Not Equal");
				}
				
			}
		

	}



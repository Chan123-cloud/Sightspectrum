package week6task1;

public class RuntimeErrors {

	public static voID main(String[] args) { //Compile time error
		
		
		int a[] = new int [3];
		a[6] = 221;
		System.out.println(a[6]); // Run time error
		
		
		int e =10,b=20,c=30;
		int f = e+c/b;           // logical error
		System.out.println(f);
		
		
		

	}

}

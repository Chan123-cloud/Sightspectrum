package week6task1;

public class TryCatch {

	public static void main(String[] args) {
		int a =100;
		int b =0;
		try {
			int c= a/b;
			System.out.println(c);
		}
		catch(Exception E) {
			System.out.println("wrong division");
		}
		
		System.out.println("completed");
		
		

	}

}

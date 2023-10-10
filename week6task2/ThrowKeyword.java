package week6task2;

public class ThrowKeyword {

	public static void main(String[] args) {
		int a =100;
		int b =10;
		try {
			int c= a/b;
			System.out.println(c);
		throw new Exception(); // Throw keyword to throw an error if try block is crt
		}
		catch(Exception E) {
			int c =a/1;
			System.out.println(c);
			System.out.println("wrong division");
		}
		
		System.out.println("completed");

	}

}

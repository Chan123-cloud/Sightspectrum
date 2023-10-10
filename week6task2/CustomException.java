package week6task2;


public class CustomException {

	public static void main(String[] args) {
		String s = "CHANDRA KUMAR";
		String k = "Chandra kumar";
		try {
			System.out.println(s.equalsIgnoreCase(k));
		throw new ChandraException();  // own exception creation
		}
		catch(Exception E) {

			System.out.println(s.length());
			System.out.println("correct length");
		}
		
		System.out.println("Exection is completed");


	}

}

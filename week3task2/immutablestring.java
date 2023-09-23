package week4task2;

public class immutablestring {

	public static void main(String[] args) {
		String s ="CHANDRA";
		 s.concat("KUMAR");
		System.out.println(s);
		
		
		String d ="CHANDRA";
		String s1 = d.concat("KUMAR");
		System.out.println(s1);


	}

}

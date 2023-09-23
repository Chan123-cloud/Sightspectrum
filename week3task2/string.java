package week4task2;

public class string {

	public static void main(String[] args) {
		String s=  new String("CHANDRA");
		String s1= new String("");
		String s2= new String(" kumar ");


		System.out.println(s);
		System.out.println(s.charAt(3));
		System.out.println(s1.valueOf(s));
		System.out.println(s.length());
		System.out.println(s.concat(s2));
		System.out.println(s.equals(s2));
		System.out.println(s2.equalsIgnoreCase(s));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s2.replace("j","d"));
		System.out.println(s2.trim());
		
	}

}

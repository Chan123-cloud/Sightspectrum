package JavaPrograms3;

public class OccuranceOfChar {

	public static void main(String[] args) {
		String f ="Have a nice day";
		int count1 = f.length();
		int count2 = f.replaceAll("a","").length();
		int count3 = count1 -count2;
		System.out.println(count3);
		
		

	}

}

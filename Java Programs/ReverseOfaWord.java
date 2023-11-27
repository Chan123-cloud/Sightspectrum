package JavaPrograms3;

public class ReverseOfaWord {

	public static void main(String[] args) {
		String s = "HELLO SIR";
		String a[] = s.split(" ");
		String revString = "";
		for(String f : a) {
			String revWord ="";
			for(int  i = f.length()-1 ; i>=0 ; i--) {
				revWord = revWord + f.charAt(i);
			}
			revString = revString + revWord +" ";
		}
		System.out.println(revString);

	}

}

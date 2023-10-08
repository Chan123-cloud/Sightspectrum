package week5task2;

public class Main2 {

	public static void main(String[] args) {
		Eclass E[] = Eclass.values();  // method to print the objects or constants
		for(Eclass x :E) {  //For each loop(We can print all the constants)
			System.out.println(x +":" +x.ordinal()); //method for the index of constants
		}
		
		

	}
	

}

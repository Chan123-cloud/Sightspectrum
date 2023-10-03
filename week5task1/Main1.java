package week5task1;

public class Main1 {

	public static void main(String[] args) {
		OuterClass a = new OuterClass();
		a.name();
		
		OuterClass.InnerClass b = a. new InnerClass(); //Non static Inner class
		b.age();
		

	}

}

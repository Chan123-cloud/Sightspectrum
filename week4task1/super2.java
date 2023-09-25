package week4task1;

public class super2 extends super1 {

	public super2() {
	
		System.out.println("Hi harish");
	
	}
	public super2(int n) {
	
	    this();
		System.out.println("Hi chandru");
	      
		
	}


	public static void main(String[] args) {
		super2 s = new super2(5);
		super1 d = new super1(5);
		
	}

}

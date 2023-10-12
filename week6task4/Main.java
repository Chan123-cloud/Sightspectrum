package week6task4;

public class Main {

	public static void main(String[] args) {
		Thread1 A = new Thread1();
		Thread2 B = new Thread2();
	   System.out.println(A.getPriority());
		try {
			Thread.sleep(2000);
			}
			catch (Exception E) {
				
			}

		System.out.println(B.getPriority());
		A.start();
	    B.start();
	    B.setPriority(Thread.MAX_PRIORITY);
	}
}




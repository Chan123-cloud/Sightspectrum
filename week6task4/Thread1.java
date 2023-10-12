package week6task4;

public class Thread1 extends Thread {
	public void run() {
		int i =1;
		while(i<=5) {
			try {
				Thread.sleep(3000);
				}
				catch (Exception E) {
					
				}
System.out.println("Hi Chandra kumar");
			i++;
					}
		
	}

}

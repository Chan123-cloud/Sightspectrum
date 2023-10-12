package week6task4;

public class Thread2  extends Thread{
	public void run() {
		int j =1;
		do {
			try {
				Thread.sleep(3000);
				}
				catch (Exception E) {
					
				}


			System.out.println("Hi Ranjith");
			j++;

		}
			while(j<=5);
		
}

}

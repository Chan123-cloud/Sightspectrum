package week6task4;

public class Main1 {

	public static void main(String[] args) {
       Runnable1 s = new Runnable1();
       Runnable2 K = new Runnable2();
       Thread v = new Thread(s);
       Thread j =  new Thread(K);
       v.start();
       j.start();
	}
}
       



	

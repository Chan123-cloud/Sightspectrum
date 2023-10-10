package week6task1;

public class Main {

	public static void main(String[] args) {
		LambExpRet a =  (int s,int t) -> s-t;  //Lambda expression with return
		   int c = a.sub(3, 4);
           System.out.println(c);

	}

}

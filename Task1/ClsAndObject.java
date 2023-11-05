package Task1;

public class ClsAndObject {
	int a = 40;
	int b = 50;
	 
	 public int sub(int a , int b) {
		int c = a-b;
		return c;
	 }
	public static void main(String[] args) {
	 
       
		ClsAndObject g =  new ClsAndObject() ;
		
        System.out.println(g.sub(g.a ,g.b));

	}

}

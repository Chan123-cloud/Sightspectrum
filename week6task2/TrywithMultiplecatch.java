package week6task2;

public class TrywithMultiplecatch {

	public static void main(String[] args) {
		short s = 2;
	    short k = 0;
	    int a[] = new int [4];
	    
	    try {
	    	long e = s/k;
	    	   System.out.println(a[5]);
	    	}
	    catch (ArrayIndexOutOfBoundsException w) {
	    	System.out.println("Out of bound" );
	    }
	    catch (ArithmeticException x) {
	    	System.out.println("Denominator should not be zero");
	    }
	    System.out.println("These are the errors");
	    	
	    }
		

	}



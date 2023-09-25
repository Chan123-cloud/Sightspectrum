package week4task1;

public class defandparconstructor {

	public defandparconstructor(int a,int b) {  // PARAMETERIZED CONSTRUCTOR
		int c = a*b;
		System.out.println(c);
		
	}
	public defandparconstructor() {     // DEFAULT CONSTRUCTOR
		int a = 10;
		int b =20;
		int c = a+b;
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		defandparconstructor c = new defandparconstructor(40,50);
        defandparconstructor c1 = new defandparconstructor();
        }

}

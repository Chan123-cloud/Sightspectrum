package week4task1;

public class ClassI {

	public static void main(String[] args) {
		int s[][][]=new int[2][2][2];
		s[0][0][0] = 10;
		s[0][0][1] = 20;
		s[0][1][0] = 30;
		s[0][1][1] = 40;
		s[1][0][0] = 50;
		s[1][0][1] = 60;
		s[1][1][0] = 70;
		s[1][1][1] = 80;
		System.out.println(s[0][0][0]);
		System.out.println(s[0][0][1]);    // println method
		System.out.println(s[0][1][0]);
		System.out.println(s[0][1][1]);
		System.out.println(s[1][0][0]);
		System.out.println(s[1][0][1]);
		System.out.println(s[1][1][0]);
		System.out.println(s[1][1][1]);
	}
}
		
	

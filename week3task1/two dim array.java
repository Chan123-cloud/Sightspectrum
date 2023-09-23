package week4task1;

public class ClaasG {

	public static void main(String[] args) {
		int s[][]=new int[3][3];
		s[0][0] = 10;
		s[0][1] = 20;
		s[0][2] = 30;
		s[1][0] = 40;
		s[1][1] = 50;
		s[1][2] = 60;
		System.out.println(s[0][0]);
		System.out.println(s[0][1]);    // println method
		System.out.println(s[0][2]);
		System.out.println(s[1][0]);
		System.out.println(s[1][1]);
		System.out.println(s[1][2]);
		

		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
		   System.out.println(s[i][j]);     // looping condition
		}
}

}
}
package week4task4;

public class thiskeyword {
	boolean c ;
	char initial;


	public thiskeyword(boolean c, char initial) {
		this.c =c;
		this.initial = initial;
	}
	
		public void det() {
			System.out.println(initial );
			System.out.println(c);
		}

public static void main(String[] args) {
		thiskeyword d = new thiskeyword(true ,'M');
		d.det();

	}

}

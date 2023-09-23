package week4task4;

public class constructors {
	String c ;
	String name;

	public constructors(String c, String name) {
		this.c =c;
		this.name = name;
				
			}
	public void det() {
		System.out.println(  c +':'+ name);
	}

	public static void main(String[] args) {
		constructors d = new constructors ("Hiii","Chandra kumar");
		d.det();

		

	}

}

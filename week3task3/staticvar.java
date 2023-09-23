package week4task3;

public class staticvar {
	int age;
	String name; 
	static String country;
	public void detials() {
		System.out.println(name +':'+age +':' + country );
	}
   public static void main(String[] args) {
	   staticvar a = new staticvar();
	   a.age = 21;
	   a.name = "Chandru";
	   staticvar.country = "India";
	   
	   staticvar b = new staticvar();
	   b.age = 22;
	   b.name = "Livin";
	   staticvar.country = "India";
	   a.detials();
	   b.detials();
	   
	   
		
	}

}

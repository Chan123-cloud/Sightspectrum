package week4task3;

public class staticmthd {

		static int age;
		static String name; 
		static String country;
		double salary;
		public static void detials() {
			System.out.println(name +':'+age +':' + country );
		}

		public static void detials1(staticmthd c) {
			System.out.println(name +':'+age +':' + country+':'+c.salary );
		}
		 public static void main(String[] args) {
		   staticmthd.age = 21;
		   staticmthd.name = "Kamal";
		   staticmthd.country = "India";
           staticmthd.detials();
           staticmthd c = new staticmthd();
           c.salary = 250000.234;
           staticmthd.detials1(c);
	}

}

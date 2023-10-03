package week5task1;

public class WrapperClass {

	public static void main(String[] args) {
			double d = 12345.3456;
			
			Double E = Double.valueOf(d); //Boxing
			System.out.println(E);
			
			Double F= d;     //AutoBoxing
			System.out.println(F);
			
			double s = F.doubleValue();  //Unboxing
			System.out.println(s);
			
			double c = F;   //Autounboxing
			System.out.println(c);
			


	}

}

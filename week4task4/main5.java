package week4task4;

public class main5 {

	public static void main(String[] args) {
		UpandDownCast1 v = (UpandDownCast1)new UpandDownCast2(); // Upcasting
		v.age();
		UpandDownCast2 g = (UpandDownCast2)v; // Downcasting
		g.name();

	}

}

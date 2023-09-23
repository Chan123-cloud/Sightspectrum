package week4task2;

public class Arrayofanobj {
	int marks;
	String  name;
	double per;
	

	public static void main(String[] args) {
		Arrayofanobj c = new Arrayofanobj();
		c.marks = 97;
		c.name = "chandru";
		c.per = 96.12;
		
		Arrayofanobj h = new Arrayofanobj();
		h.marks = 78;
		h.name = "hari";
		h.per = 76.45;
		
		Arrayofanobj[] a = new Arrayofanobj[2];
		int i=0;
		a[0] = c;
		a[1] = h;
		do {
			System.out.println(a[i].marks+ ":" +a[i].per);
            i++;
		}
		while(i<a.length);
	
	}

}

package week3task4;
public class ClassA {
int BoxVolume(int l, int b,int h) {
	int d=l*b*h;
	return d;
	}
public static void main(String[] args) {
	  ClassA C=new ClassA();
	  System.out.println(C.BoxVolume(2,3,5));
		
}
}

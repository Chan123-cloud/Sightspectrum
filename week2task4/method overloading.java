package week3task4;

public class ClassC {
	int BoxVolume(int l, int b,int h) {
		int d=l*b*h;
		return d;
		}
	double BoxVolume(double j, double h) {
		double e=j*h;
		return e;
		}
	
	public static void main(String[] args) {
		  ClassC A =new ClassC();
		  System.out.println(A.BoxVolume(2,3,5));
		  System.out.println(A.BoxVolume(5.67854,6.5745));
	}
	}




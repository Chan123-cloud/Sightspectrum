package Javaprograms2;

public class MinandMaxinArray {

	public static void main(String[] args) {
		int a[] = {194,34,2345,56,78};
		int min = 0 , max = 0;
		min = a[0];
		max = a[0];
		for(int i =0 ; i<a.length ; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
		}
			System.out.println(max);
			System.out.println(min);
		

	}

}

package JavaPrograms1;

public class CountSumOfDigits {

	public static void main(String[] args) {
		int i = 12345678;
		int sum = 0;
		while(i>0) {
			int j =i%10 ;
			sum = sum +j;
			i = i/10;
		}
		System.out.println(sum);

	}

}

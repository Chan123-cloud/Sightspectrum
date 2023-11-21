package JavaPrograms1;
public class PrimeNumber {

	public static void main(String[] args) {
			int count = 0;
			int a = 6;
			for(int i =1 ; i<=a ;i++) {
				if(a%i==0) {
					count ++;
				}
			}
				if(count==2) {
					System.out.println("Prime number");
				}
				else {
					System.out.println("Not a prime number");
				}
				
			}




	}



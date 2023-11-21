package JavaPrograms1;

public class CountEvenandOddDigits {
	public static void main(String[] args) {
	   int a = 12345;
	   int count1= 0;
	   int count2= 0;
	   while(a>0) {
		  int  b = a%10;
		  
		   if (b%2==0) {
			   count1++;
			   }
		 	 
		   else {
			   count2++;
		   }
		   a = a/10;
	   }
	   System.out.println(count1);
	   System.out.println(count2);

		}

	}



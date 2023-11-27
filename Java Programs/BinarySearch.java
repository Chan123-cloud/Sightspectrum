package JavaPrograms3;
public class BinarySearch {
public static void main(String[] args) {
	 int c[] = {10,20,30,40,50,60,70,80};
	 int search =10;
	 int low = 0;
	 int hig = c.length-1;
	 boolean d = false;
	 while(low<=hig) {
		 int mid = low+hig/2;
		 if(c[mid] == search) {
			 System.out.println("Element found");
			 d = true;
			 break;
		 }
		 if(c[mid]<search) {
			 low =mid+1;
		 }
		 if(c[mid]>search) {
			 hig =mid-1;
		 }
	 }
	 if(d==false) {
		 System.out.println("Element Not Found");
	 }
	 
	 

	}

}

package JavaPrograms3;

public class DuplicateElement {

	public static void main(String[] args) {
		int arr[]= {12,456,34,678,456};
		for(int i =0 ; i<=arr.length ; i++) {
			for(int j =i+1 ; j<arr.length ; j++) {
				if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
					
				}
			}
		}

	}

}

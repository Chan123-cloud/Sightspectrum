package JavaPrograms3;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {2,4,3454,43,0};
		int n = arr.length;
		for(int i = 0 ; i<n-1 ; i++) {
			for(int j = 0 ; j<n-1 ; j++) {
				if(arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t ; 
					
				}
			}
		}
       System.out.println("Sorted" +Arrays.toString(arr));
	}

}

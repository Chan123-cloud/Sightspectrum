package JavaPrograms3;

import java.util.Arrays;
import java.util.Collections;

public class SortInbuiltMet {

	public static void main(String[] args) {
		int v [] = {23,45,67,4,1,203};
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		
		
		Integer d [] = {23,45,67,4,1,203}; // collections not support int (primitive)
		Arrays.sort(d,Collections.reverseOrder());
		System.out.println(Arrays.toString(d));
		

	}

}

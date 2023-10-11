package week6task3;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		try (Scanner a = new Scanner(System.in); // Automatically closes the resources
)
		{
			System.out.println("Enter the double value");
			 double c = a.nextDouble();
			 System.out.println(c);
		
		}

	}

}

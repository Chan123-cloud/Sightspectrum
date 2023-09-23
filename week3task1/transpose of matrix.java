package week4task1;

import java.util.Scanner;

public class ClassF {

	public static void main(String[] args) {
	    int r,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the rows");
        r=sc.nextInt();
		System.out.println("Enter the coloums");
        c =sc.nextInt();
        int a[][]=new int [r][c];
        System.out.println("Enter the values");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[j][i]);
			}
			System.out.println();
	}
}
}

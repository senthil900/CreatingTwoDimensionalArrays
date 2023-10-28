package basictraining;

import java.util.Scanner;

public class TwoDimensionalArray {
	int i,j;
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of row:");
		int i=s.nextInt();
		
		System.out.println("Enter the no of column:");
		int j=s.nextInt();
		
		int arr[][]=new int[10][10];
		
		
		for(i=0;i<4;i++) {
			for(j=0;j<3;j++) {
				arr[i][j]=s.nextInt();
			}
			
		}
		for(i=0;i<4;i++) {
			for( j=0;j<3;j++) {
				System.out.print(arr[i][j]);
			}
		}
	}

}

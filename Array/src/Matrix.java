import java.util.*;

public class Matrix {
	public static void main(String args[]) {
		Scanner sn= new Scanner(System.in);
		
	int arr[][]=new int[2][2];
	int arr2[][]=new int [2][2];
	for(int i=0; i<2; i++) {
		for(int j=0; j<2; j++) {
			System.out.println("enter your first number");
			arr[i][j]=sn.nextInt();
		}
		}
	for(int a=0; a<2; a++) {
		for (int b=0; b<2; b++) {
			System.out.println("enter your second number");
		arr2[a][b]=sn.nextInt();
	}
}
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+"\t");
		
	}
	System.out.println();
	
	}
	
	for(int a=0; a<2; a++) {
		for (int b=0; b<2; b++) {
			System.out.print(arr2[a][b]+"\t");
	
		}
		System.out.println();
	}
	}
	
	}
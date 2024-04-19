import java.util.Scanner;
public class AdditionMatrix {
		public static void main(String args[]) {
			Scanner sn= new Scanner(System.in);
			
		int arr[][]=new int[3][3];
		int arr2[][]=new int [3][3];
	
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("enter your first number");
				arr[i][j]=sn.nextInt();
			}
			}
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("enter your second number");
			arr2[i][j]=sn.nextInt();
		}
	}
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				int addition[][]=new int[3][3];
				  addition[i][j]=arr[i][j]+arr2[i][j];
				 System.out.print(addition[i][j]+"\t");
			}
			System.out.println();
			}
		
		}
		
		}
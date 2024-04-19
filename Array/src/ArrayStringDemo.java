import java.util.Scanner;

public class ArrayStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  sn = new Scanner(System.in);
		String arr[]=new String[10];
		for (int i=0; i<10; i++)
		{ System.out.println("Enter"+(i+1)+"value");
		arr[i]=sn.next();
		
		}
		for(int i=0; i<10; i++)
		{System.out.println((i+1)+"Number is :"+arr[i]);
		
		}
	}
	}

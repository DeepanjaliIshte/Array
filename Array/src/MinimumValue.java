
public class MinimumValue {


	public static void main(String[] args) {
		int arr[]= {11,28,10,19,25,35};
		
	int min=arr[0];
	for(int i=0; i<arr.length; i++) {
		if (arr[i]<min) {
			min=arr[i];
		}
	}
		  
System.out.println("Laeg number:"+min);		
		
	}

}


public class MaximumValue {

	public static void main(String[] args) {
		int arr[]= {11,28,10,19,25,35};
		
	int max=arr[0];
	for(int i=0; i<arr.length; i++) {
		if (arr[i]>max) {
			max=arr[i];
		}
	}
		
System.out.println("Large number:"+max);		
		
	}

}

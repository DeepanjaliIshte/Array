
public class ArraySearch {

	public static void main(String[] args) {
		
		int arr[]= {11,28,10,19,25,35};
		int num=25;
	int count =0;
	for(int i=0;i<arr.length;i++) {
	
	 if (num==arr[i]) {
		 count++; 
	 }
	}
	 if (count>=1) {
		 System.out.println("number is available");
	 }
	 else {
		 System.out.println("number is not avaolable");
	 }
	}
	}	
	
	
		
	

	

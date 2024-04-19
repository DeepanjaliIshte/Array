
public class Anonymous_Array {

	public static void main(String[] args) {
		Anonymous_Array.sum(new int[] {10,30,50});
	}

	private static void sum(int[] no) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i:no)
		{
			total=total+i;
		}
		System.out.println("Sum is : "+total);
	}

}

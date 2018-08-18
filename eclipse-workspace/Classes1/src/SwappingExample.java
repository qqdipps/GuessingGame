
public class SwappingExample {

	static int i = 9;
	static int j = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapPrint( i, j);
		swap( i, j);
		swapPrint( i, j);
		
		
	}
	private static void swapPrint(int i, int j) {
		System.out.print("int i = " + i + " and ");
		System.out.println("int j = "+ j);
		System.out.println("");
	}
		
		
	

	private static void swap(int i2, int j2) {
		// TODO Auto-generated method stub
		System.out.println("Swapping Values i and j.....");
		i = j2;
		j = i2;
		
	
		
	
	}

	
}

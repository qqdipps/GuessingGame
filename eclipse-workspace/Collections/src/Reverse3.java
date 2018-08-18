import java.util.Arrays;

public class Reverse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] intArr3 = {3,2,5,4};
		System.out.println(Arrays.toString((intArr3)));
		
		ArrRev(intArr3);
		System.out.println(Arrays.toString(ArrRev(intArr3)));
		
	}
		
		
		public static int [] ArrRev(int[] intArr3) {
			int [] copy = new int[intArr3.length];
		for(int i = 0; i<intArr3.length; i++) {
			copy[i] = intArr3[intArr3.length-1 - i];
			System.out.println(Arrays.toString(copy));
			
		}
		
		return copy;

		}
}

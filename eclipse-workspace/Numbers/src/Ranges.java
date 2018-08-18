
public class Ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		System.out.println(b++);
		System.out.println(b+" "+(b+1) +" " +(b+2) +" "+ (b+3)+" " + (b+ 127));
		int maxInt = Integer.MAX_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println(maxInt);
		System.out.println(maxDouble);
		System.out.println(maxInt + 1);
		System.out.println(maxDouble + maxInt); // no overflow for double
	}

}

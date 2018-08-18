
public class StringLength {
static String str1 = "hello";
static String str2 = "knteot";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Total string length is " + addStringLen(str1, str2));
		System.out.println("Average string length is " + averageStringLen(str1, str2));
		
	}
	private static double averageStringLen(String str1a, String str2a) {
		// TODO Auto-generated method stub
		double aveString = addStringLen(str1a,str1a);
	
		return aveString / 2;
	}
	private static int addStringLen(String str1a, String str2a) {
		// TODO Auto-generated method stub
		int addString = str1a.length() + str2a.length();
		return addString;
		
	}
	
}

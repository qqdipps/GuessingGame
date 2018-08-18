
public class MissingChar {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kitten";
		int n = 4;
		String subStr = str.substring(0,n) + str.substring(n+1,str.length());
		System.out.println(subStr);
		
	}

}

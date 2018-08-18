
public class FrontBack {
	public static void main (String [] args) {
		String	str = "code" ;
		String strSwitch = str.substring(str.length()-1) + str.substring(1, str.length() - 1) + str.substring(0,1);
		
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(str.length()-1);
		String str3 = str.substring(1, str.length()-1);
		
 		
		System.out.println(strSwitch);
	}
}

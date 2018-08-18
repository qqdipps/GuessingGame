
public class StartHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hi there";
		String str2 = "hello hi";
		
		String strHi = "hi";
		String strSub = str2;
	
		String str = strSub.substring(0,2);
		
		System.out.println(str.equals(strHi));
		System.out.println(str.contains("hi")); //"hi" can sub for strHi
		System.out.println(strSub.startsWith("hi"));
		
		
//		System.out.println(str == strHi);  always false when strings are not the same storage 
	
//		strSub = str2;
//		str = strSub.substring(0,2);
//		System.out.println(str.equals(strHi));
		
	}

}

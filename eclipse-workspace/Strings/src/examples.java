
public class examples {
	public static void main(String [] args) {
		String str = "Java";
		
	
		
		String str3 = str.substring(2, str.length()-1);
		System.out.println(str3);
		
		String str2 = "Java";
		StringBuilder sb = new StringBuilder("Java");
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Hello World");
		System.out.println(sb1);
		System.out.println(sb1.toString()); 
		
		
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase("HI"));
		System.out.println(sb);
		//System.out.println(str2==sb); can not compare string and sb types
		System.out.println(str.equals(sb));  //okay but return is false
		System.out.println(str.contentEquals(sb));  // to compare string and sb types
	
		
		
	}
}

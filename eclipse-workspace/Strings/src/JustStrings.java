
public class JustStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doubleVar = 4.0/3.0;
		int intVar = 3;
		String stringVar = "August";
		
		
		
		
	String dvs;
	dvs = String.format("The value is %.2f. ", doubleVar);
	System.out.println(dvs);
	
	String ivs = String.format("The value is %d. ", intVar);
	String svs = String.format("The value is %2s. ", stringVar);
	
	StringBuilder sb = new StringBuilder(dvs + ivs +svs);
	System.out.println(sb);
	
	
	}

}

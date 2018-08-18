/**
 * temp conversion
 * @author qqdipps
 *
 */
public class Temp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double f = 47.2;
		double c = 0;
		double k = 275;
		
		double ftoC = (f-32)*5/9;
		double ctoF =  (c * 9/5)+32;
		double ktoF = (k - 273.15) * 9/5 + 32;
		
		Boolean testTemp = (ktoF < ctoF);
		System.out.println(testTemp);
		System.out.println(ftoC);
		System.out.println(ctoF);
		System.out.println(ktoF);
		
	}

}

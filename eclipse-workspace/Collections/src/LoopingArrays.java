
public class LoopingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String [] mOfY = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
		System.out.println(mOfY.length);
		for (int i = 0; i < mOfY.length; i++ ) {
			System.out.print(mOfY[i] + " ");
		}	
		System.out.println("");
		for (String month : mOfY) {
			System.out.print(month+ " ");
		}
		System.out.println("");
		int i = 0;
		while(i<mOfY.length) {
			System.out.print(mOfY[i] + " ");
			i++;
	
		}
	}

}

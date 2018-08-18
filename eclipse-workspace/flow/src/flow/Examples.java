package flow;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean seahawksWins = false;
			
		String afterPart = (seahawksWins)? "party" :"call in sick";
		if (seahawksWins) {
			System.out.println("party");
		}
		else {
			System.out.println("caleb quits");
		}
		
		int iphone = 1000;
		if (iphone >= 1000) {
			System.out.println("buy last");
		}
		else if (iphone >= 500 && iphone <1000) {
			System.out.println("buy");
		}
		else if (iphone < 500) {
			System.out.println("scam");
		}
		
		int num = 4;
		switch(num) {
		case 1:
			System.out.println(num + 1);
			break;
		case 2:
			System.out.println(num +2);
			break;
		case 3:
			System.out.println(num +3 );
			break;
		default:
			System.out.println("num is none");
		}
	
		for (int i = 0; i< 5; i++){
			System.out.println("hello num  " + i);
		
		}
		int i = 0;
		while ( i < 1) {
			System.out.println("stuck in loop");
			i++;
			
		}
	}

}

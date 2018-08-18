package flow;

public class SumDouble {
	public static void main(String [] args) {
	int x = 2;
	int y = 4;
	
	if (x == y) {
		System.out.println(2*(x+y));
	}
	else {
		System.out.println(x+y);
	}
		
	


	int W = (x==y)? 2*(x+y) : (x+y) ;
	System.out.println(W);
	}
}
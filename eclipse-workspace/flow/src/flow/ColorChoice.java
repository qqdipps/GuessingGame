package flow;

public class ColorChoice {
	public static void main(String [] args) {
		String color = "red" ; 
		String red = "red";
		
		switch(color.toUpperCase()) {
		case "red": 
			System.out.println("red");
			break;
		case "blue":
			System.out.println("blue");
			break;
		case "green":
			System.out.println("green");
			break;
		default:
			System.out.println("not a prim col");
		
		}
	}
}

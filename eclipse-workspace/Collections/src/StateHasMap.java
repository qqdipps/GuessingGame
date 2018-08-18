import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateHasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Map<String,String> stateMap = new HashMap<String,String>();
	stateMap.put("WA", "Washington");
	stateMap.put("OR", "Oregeon");
	stateMap.put("ID" , "Idaho");
	stateMap.put("AK", "Alaska");
	stateMap.put("OK", "Oklahoma");
	
	Scanner inState = new Scanner(System.in);
	System.out.println("Which state?");
	String input = inState.nextLine().toUpperCase();
	System.out.println(stateMap.get(input));
	
	
	
		
	}

}

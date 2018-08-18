import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray;
		myArray = new int[5];
		
		int [] myArray2 = new int [5];
		myArray[0] = 1;
		myArray[2] = 3;
		myArray[1] = 'A';
		
		System.out.println(Arrays.toString(myArray));
	
		List<String> heroList = new ArrayList<String>();
		heroList.add("Superman");
		heroList.add("turkeyMan");
		
		System.out.println(heroList);
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(52);
		nums.add(42);
		nums.add(32);
		
		System.out.println(nums);
		
		String num = "1234";
		int x = Integer.parseInt(num);
		System.out.println(x);
		
		int [] count = {32,3,42,34,44,44,34,5,6,3};
		Set<Integer> set1 = new HashSet<Integer>();
		
		for(int i = 0; i <count.length; i++) {
			set1.add(count[i]);
		}
		
		System.out.println(set1);
		System.out.println(set1);
		
		Set<Integer> set2 = new TreeSet<Integer>(set1);
		System.out.println(set2);
		
		Map<String,String> map1= new HashMap<String,String>();
		
		map1.put("a", "candy");
		map1.put("b", "BirthdayCake");
		System.out.println(map1.toString());
		
		Map<String,String>m1 = new HashMap<String, String>(mapB(map1));
		System.out.println(m1.toString());
		
	}

	public static Map<String,String> mapB (Map<String,String> map){
		if (map.containsKey("a")) {
			map.put("b",  map.get("a"));  //overwrites value if same key
			map.put("a", " ");
			
		}
		return map;
	}
}

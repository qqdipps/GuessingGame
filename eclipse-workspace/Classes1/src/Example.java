
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a = 5;
	int b = 4;
	
	int sum = addition(a,b);
//	message(sum);
	
	String breed = "Husky";
	Dog pet = new Dog(breed);
	System.out.println(pet.getBreed());
	pet.setBreed("ant");
	System.out.println(pet.getBreed());
	pet.setAge(12);
	
	System.out.println(pet.getAge());
	}

	private static int addition(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a + b;
		return sum;
	}
		
	

	private static void message(int sum) {
		System.out.println(sum);
	}


}
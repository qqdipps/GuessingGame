
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String make = "Chevy";
		String model = "Camaro";
		int year = 2017;
		String color = "black";
		Car myCar = new Car(make, model, 2017, color);
		System.out.println("Make: " + myCar.getMake());
		System.out.println("Model: " + myCar.getModel());
		System.out.println("Year :" + myCar.getYear());
		System.out.println("Color: " + myCar.getColor());
		Car secondCar = new Car("crap", "carppy", 1990, "marron");
		
		System.out.println(secondCar.getId());
	}

}

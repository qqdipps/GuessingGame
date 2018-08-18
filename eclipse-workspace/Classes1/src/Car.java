
public class Car {
	private String Make;
	private String Model;
	private int year;
	private String Color;
	
	private static int nextId;
	private int id;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public Car(String Make, String Model, int year, String Color) {
		this.Make = Make;
		this.Model = Model;
		this.year = year;
		this.Color = Color;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return Make;
	}

	/**
	 * @return the nextId
	 */
	public static int getNextId() {
		return nextId;
	}

	/**
	 * @param nextId the nextId to set
	 */
	public static void setNextId(int nextId) {
		Car.nextId = nextId;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		Make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return Model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		Model = model;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return Color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		Color = color;
	}
	
	

}

public abstract class Vehicle {
	
	protected String make;
	protected String model;
	protected String year;
	protected String color;
	protected int powerLevel;
	
	public Vehicle(String make, String model, String year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.powerLevel = 100;
	}

	public abstract void honk();
	
	public void drive() {
		powerLevel--;
	}
	public String description() {
		return  "-make: " + make + " -model: " + model + " -year: "+ year + "-color " + color;  
	}
	
	public void changeColor(String color) {
		this.color = color;
	}


	
}

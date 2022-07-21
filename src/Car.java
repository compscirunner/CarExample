
public class Car extends Vehicle {

	private int numOfWheels;
	private int numOfSeats;
	
	public Car(String make, String model, String year, String color, int numOfWheels, int numOfSeats) {
		super(make, model, year, color);
		this.numOfWheels = numOfWheels;
		this.numOfSeats = numOfSeats;
	}




	@Override
	public void honk() {
		// TODO Auto-generated method stub
		System.out.println("BEEP BEEP");
	}
	
	public void drift() {
		System.out.println("drifting");
	}




	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Car " + super.description()+ "wheels "+ numOfWheels + "seats " + numOfSeats ;
	}
	
	




	
	
	

}

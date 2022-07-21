
public class Truck extends Vehicle {

	
	private int bedLength;




	public Truck(String make, String model, String year, String color, int bedLength) {
		super(make, model, year, color);
		this.bedLength = bedLength;
	}




	@Override
	public void honk() {
		System.out.println("HONK HONK");

	}

}

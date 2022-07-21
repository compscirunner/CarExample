
public class Van extends Vehicle {

	private boolean hasSlidingDoors;



	public Van(String make, String model, String year, String color, boolean hasSlidingDoors) {
		super(make, model, year, color);
		this.hasSlidingDoors = hasSlidingDoors;
	}



	@Override
	public void honk() {
		// TODO Auto-generated method stub
		System.out.println("BBBBBBBBBBBBBBEEEEEPPPPPP");
	}



	@Override
	public String description() {
		// TODO Auto-generated method stub
		if(hasSlidingDoors) {
			return "Van " + super.description() + " has sliding doors";	
		}
		return "Van " + super.description() + " does not have sliding doors";
	}
	
	

}

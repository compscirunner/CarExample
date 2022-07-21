import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		Car tesla = new Car("Tesla","3","2021","red",4,5);
		
		Truck f150 = new Truck("Ford","F150","2020","white",6);
		
		Van sprinter = new Van("Mercedes", "Sprinter","2005","white",true);
		
		
		
		vehicles.add(tesla);
		vehicles.add(f150);
		vehicles.add(sprinter);
		
		
		for(Vehicle tempVehicle:vehicles) {
			tempVehicle.changeColor("blue");
			System.out.println(tempVehicle.description());
			tempVehicle.honk();
			if(tempVehicle instanceof Car) {
				((Car) tempVehicle).drift();
			}
			
		}
		
		
//		
//		System.out.println(tesla.toString());
//		tesla.honk();
//		f150.honk();
	}

}

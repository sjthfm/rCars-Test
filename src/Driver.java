import java.util.ArrayList;

public class Driver {
	
	public static void main(String[] args) {
		JSONObj jObj = new JSONObj();
		ArrayList<VehicleStat> vehicles = jObj.returnArrayOfVehicles();
		
		PriceOrderOfCar priceOrder = new PriceOrderOfCar(vehicles);
		
	}

}

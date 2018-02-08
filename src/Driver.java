import java.util.ArrayList;

public class Driver {
	
	public static void main(String[] args) {
		JSONObj jObj = new JSONObj();
		
		ArrayList<VehicleStat> vehicles = jObj.returnArrayOfVehicles(); // returns an array of vehicle stats
		
		PriceOrderOfCar priceOrder = new PriceOrderOfCar(vehicles); // Prints out order of cars by price
		
		CarSIPP 		carSIPP    = new CarSIPP(vehicles); //specification of the vehicles based on their SIPP
		
		SupplierRating supRating   = new SupplierRating(vehicles);
	}

}

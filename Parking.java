
public class Parking {

	public static void main ( String[] arguments){
	    
		Plaza plaza = new Plaza ();
		
		Bike bike0 = new Bike (2, 15.5, 45.5, 3.5, 5, "aluminium", "mountain_bike", true, false);
		Car car0 = new Car (5, 455.5, 125.0 , 14.5, 5, "TR548LK", 95.5, 95, 5, true);
		Bus bus0 = new Bus (9, 685.5, 135.0 , 10.5, 5, "LO555RF", 85.9, 75, "schoolbus");
		Truck truck0 = new Truck (3, 145.5, 155.0 , 11.5, 5, "UY585UY", 105.6, 115, "diesel", 488.5, true);
		Car car1 = new Car (5, 785.5, 95.0 , 6.5, 5, "LO455LO", 75.6, 85, 5, true);
		Truck truck1 = new Truck (2, 225.5, 145.0 , 15.5, 5, "TR875AW", 55.0, 75, "diesel", 755.0, true);
		
		plaza.add_vehicle(bike0);
		plaza.add_vehicle(car0);
		plaza.add_vehicle(bus0);
		plaza.add_vehicle(truck0);
		plaza.add_vehicle(car1);
		plaza.add_vehicle(truck1);
		
		System.out.println("Total number of vehicles: " + plaza.num_vehicles());
		
		plaza.print();
		
		plaza.remove_vehicle(bike0);
		
		System.out.println("Total number of vehicles: " + plaza.num_vehicles());
		
		plaza.print_num_vehicle();
		
		plaza.print();
		
	}
}

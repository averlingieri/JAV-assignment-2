
public class Plaza {
   
	Parking_area<? extends Vehicle>[] area;
	int num_area;
	
	public Plaza (){
		
		num_area = 4;
	    area = new Parking_area<?> [num_area];	
	    
	    area[0] = new Parking_area<Bike> (5); 
	    area[1] = new Parking_area<Car> (5); 
	    area[2] = new Parking_area<Bus> (5); 
	    area[3] = new Parking_area<Truck> (5); 
	}
	
	
	public int num_vehicles(){
		int i;
		int count=0;
		
		for (i=0; i < num_area; i++){
			count += area[i].num_vehicles(); 
		}
		
		return count;
	}
	
	public void print_num_vehicle(){
		
			System.out.println("Number of bikes: " +  area[0].num_vehicles()); 
			System.out.println("Number of cars: " +  area[1].num_vehicles()); 
			System.out.println("Number of busses: " +  area[2].num_vehicles()); 
			System.out.println("Number of trucks: " +  area[3].num_vehicles()); 
		
	}
	
	public void add_vehicle (Vehicle v){
		if (v instanceof Bike){
			((Parking_area<Bike>)area[0]).add_vehicle((Bike) v);
		}
		else if(v instanceof Car){
			((Parking_area<Car>)area[1]).add_vehicle((Car) v);
		}
		else if(v instanceof Bus){
			((Parking_area<Bus>)area[2]).add_vehicle((Bus) v);
		}
		else if(v instanceof Truck){
			((Parking_area<Truck>)area[3]).add_vehicle((Truck) v);
		}
		else 
			System.out.println("Unvalid vehicle");
	}
	
	public void remove_vehicle (Vehicle v){
		if (v instanceof Bike){
			((Parking_area<Bike>)area[0]).remove_vehicle((Bike) v);
		}
		else if(v instanceof Car){
			((Parking_area<Car>)area[1]).remove_vehicle((Car) v);
		}
		else if(v instanceof Bus){
			((Parking_area<Bus>)area[2]).remove_vehicle((Bus) v);
		}
		else if(v instanceof Truck){
			((Parking_area<Truck>)area[3]).remove_vehicle((Truck) v);
		}
		else 
			System.out.println("Unvalid vehicle");
	}
	
	public void print(){
		for (Parking_area<? extends Vehicle> a: area){
			a.print();
		}		
	}
	
}

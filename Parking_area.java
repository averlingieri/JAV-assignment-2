import java.util.ArrayList;

public class Parking_area<T extends Vehicle> {
	
	int max_vehicles;
	ArrayList <T> vehicles;
	
	public Parking_area(int max_vehicles){
		this.max_vehicles = max_vehicles;
		vehicles = new ArrayList <T> ();
	}
	
	public void add_vehicle(T v){
		if (vehicles.size() >= max_vehicles)
			System.out.println("It's full");
		else
		    vehicles.add(v);
	}
	
	public void remove_vehicle(T v){
		if (!vehicles.remove(v))
			System.out.println("It's empty");
	}
	
	public int num_vehicles(){
		return vehicles.size();
	}
	
	public T get_vehicle(int index){
		return vehicles.get(index);
	}
	
	public void print(){
		for (T v: vehicles) {
		    v.print();
		    System.out.println("");
		}
	}
}

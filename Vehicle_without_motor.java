
public class Vehicle_without_motor extends Vehicle {
	
	String material;
    
    public Vehicle_without_motor (int num_seats, double weight, double max_speed, double height, int num_wheels, String material){
		super (num_seats, weight, max_speed, height, num_wheels);
		this.material = material;
	}
    
    @Override
    public void print (){
    	 super.print();
    	 System.out.println("Material: " + material);
    }
	
}

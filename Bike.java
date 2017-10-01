
public class Bike extends Vehicle_without_motor{
	
	String type;
	boolean bell; 
	boolean luggage_carrier;
    
    
	
	public Bike (int num_seats, double weight, double max_speed, double height, int num_wheels, String kind_towing, String type, boolean bell, boolean luggage_carrier){
		super (num_seats, weight, max_speed, height, num_wheels, kind_towing);
		this.type = type;
		this.bell = bell;
		this.luggage_carrier = luggage_carrier;
	}
	
	@Override
	public void print (){
    	 super.print();
    	 System.out.println("Type of bike: " + type);
      	 System.out.println("Include a luggage carrier: " + luggage_carrier);
      	 System.out.println("Include a bell: " + bell);
    }
	
}

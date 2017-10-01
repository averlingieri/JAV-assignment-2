
public class Car extends Vehicle_with_motor{
	
	int num_car_door;
	boolean car_ramp;
    
   
	
    public Car (int num_seats, double weight, double max_speed, double height, int num_wheels, String num_plate, double fuel, int horsepower, int num_car_door, boolean car_ramp){
    	super (num_seats, weight, max_speed, height, num_wheels, num_plate, fuel, horsepower);
    	this.num_car_door = num_car_door;
    	this.car_ramp = car_ramp;
    }
    
    @Override
    public void print (){
    	 super.print();
    	 System.out.println("Number of car doors: " + num_car_door);
      	 System.out.println("Include car ramp: " + car_ramp);
    }
    
}

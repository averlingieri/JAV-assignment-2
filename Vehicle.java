
public class Vehicle {
      int num_seats;
      double weight;
      double max_speed;
      double height;
      int num_wheels;
      
      public Vehicle (int num_seats, double weight, double max_speed, double height, int num_wheels){
    	  this.num_seats = num_seats;
    	  this.weight = weight;
    	  this.max_speed = max_speed;
    	  this.height = height;
    	  this.num_wheels = num_wheels;
      }
    
     public void print (){
    	 System.out.println("Max speed: " + max_speed + "km/h");
    	 System.out.println("Weight: " + weight + "kg");
    	 System.out.println("Height: " + height + "m");
    	 System.out.println("Number of seats: " + num_seats);
    	 System.out.println("Number of weels: " + num_wheels);
    }
 
}

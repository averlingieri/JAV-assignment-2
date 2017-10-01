
public class Vehicle_with_motor extends Vehicle {

      String license_plate;
      double  fuel;
      int horsepower;
      
      public Vehicle_with_motor (int num_seats, double weight, double max_speed, double height, int num_wheels, String license_plate, double  fuel, int horsepower){
    	  super(num_seats, weight, max_speed, height, num_wheels);
    	  this.license_plate = license_plate;
    	  this.fuel = fuel;
    	  this.horsepower = horsepower;
      }
      
      @Override
      public void print (){
     	 super.print();
     	 System.out.println("License plate: " + license_plate);
       	 System.out.println("Quantity of fuel: " + fuel + "L");
       	 System.out.println("Horsepower: " + horsepower);
     }
      
}




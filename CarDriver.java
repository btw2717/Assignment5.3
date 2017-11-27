/**
 * The CarDriver class is a class which utilizes the attributes and methods of the car class to instantiate and manipulate car objects within a main() method and print results to the screen.
 * This class inherits the attributes and methods of the Car class.
 * Created 20NOV2017
 * email: email
 * @author sapper
 * @version 1.0
 */
public class CarDriver extends Car {

	/**
	 * The main() method is the entry point of the application to which parameters may be passed. 
	 * This method is a void method which does something other than return a value.
	 * This method utilizes the constructors and methods defined in the Car class to instantiate Car objects, alter attribute data, and displays the results.
	 * @param args, arguments passed to the string array from the command line.
	 */
	public static void main(String[] args) {
		//instantiating an object using the default constructor
		Car myCar = new Car();
		//instantiating objects using the overloaded constructor
		Car hisCar = new Car("Black", 400, 3.5, "Honda");
		Car herCar = new Car("Pink", 300, 2.5, "Volks");
		//Printing the current attribute values
		System.out.println("My Car details: " + myCar);
		System.out.println();
		System.out.println("His car details: " + hisCar.toString());
		System.out.println();
		System.out.println("Her car details: " + herCar);
		//Using the setter methods of the Car class to assign instance variable values.
		myCar.setColor("Blue");
		myCar.setHorsePower(650);
		myCar.setEngineSize(6.5);
		myCar.setMake("Ferrari");

		hisCar.setColor("Blue");
		hisCar.setHorsePower(650);
		hisCar.setEngineSize(6.5);
		hisCar.setMake("Ferrari");

		herCar.setColor("Blue");
		herCar.setHorsePower(650);
		herCar.setEngineSize(6.5);
		herCar.setMake("Ferrari");
		//Display the values of the attributes using concatenated getter methods.
		System.out.println();
		System.out.println("My new car color: " + myCar.getColor() + "\nMy new car horse power: " + myCar.getHorsePower() + "\nMy new car engine size: " + myCar.getEngineSize() + "\nMy new car Make: " + myCar.getMake());

		System.out.println();
		System.out.println("His new car color: " + hisCar.getColor() + "\nHis new car horse power: " + hisCar.getHorsePower() + "\nHis new car engine size: " + hisCar.getEngineSize() + "\nHis new car Make: " + hisCar.getMake());

		System.out.println();
		System.out.println("Her new car color: " + herCar.getColor() + "\nHer new car horse power: " + herCar.getHorsePower() + "\nHer new car engine size: " + herCar.getEngineSize() + "\nHer new car Make: " + herCar.getMake());
		
	
	}
}

package ch11InheritanceAndAbstraction;
//
//  ObjectDownCastingEx1.java

// Inheritance Hierarchy and Object Type Casting

class VehicleV{
	void vehicleInfo()
	{
		System.out.println("Invokes Vehicle::vehicleInfo()");
	}
}
class CarV extends VehicleV{
	void carInfo(){
		super.vehicleInfo();
		// Invokes Vehicle::vehicleInfo() through super reference
		System.out.println("Invokes Car::carInfo()");
	}
}

class ToyotaV extends CarV {
	@Override
	void carInfo() {
		System.out.println("Invokes Toyota::carInfo()");

	}

	void toyotaSpecial() {
		System.out.println("Invokes Toyota::toyotaSpecial()");
	}
}

class MarutiV extends CarV {
	@Override
	void carInfo() {
		System.out.println("Invokes Maruti::carInfo()");
	}

	void marutiSpecial() {
		System.out.println("Invokes Toyota::marutiSpecial()");
	}

}


public class ObjectDownCastingEx1 {

	public static void main(String[] args) {

	System.out.println("Effect of Inheritance.......");
	CarV carref1 ;// carref1 has been created as an instance of Car class
			// carref1 has not been assigned yet.
	carref1 = new ToyotaV(); 
// carref1 is assigned as a run-time object of : class Toyota

	System.out.println("The carref1 is a run-time object of : " + carref1.getClass());
	System.out.println("Is carref1 an instance of Car? " + (carref1 instanceof CarV));
	System.out.println("Is carref1 an instance of Toyota? "+(carref1 instanceof ToyotaV));
System.out.println("Is carref1 an instance of Maruti? "+(carref1 instanceof MarutiV));

	System.out.println();

	System.out.println("Effect of DownCasting :: Please look carefully...");

	System.out.println();

	// carref1.toyotaSpecial();   // Shows following Compile-time Error
	// The method toyotaSpecial() is undefined for the type Car

	((ToyotaV)carref1).toyotaSpecial(); // Works good, DownCasting
	// Invokes Toyota::toyotaSpecial()
	 // ((Car)carref1).toyotaSpecial(); // Shows Compile-time Error
	// The method toyotaSpecial() is undefined for the type Car

	//((Car)((Toyota)carref1)).toyotaSpecial(); // Shows Compile-time Error
	// The method toyotaSpecial() is undefined for the type Car

	((ToyotaV)((CarV)((ToyotaV)carref1))).toyotaSpecial(); // DownCasting
	// Works good, Invokes ToyotaV::toyotaSpecial()
 }

}


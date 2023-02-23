package ch11InheritanceAndAbstraction;
//

//  ObjectUpCastingEx1.java

// Inheritance Hierarchy and Object Type Casting

class VehicleC {
	void vehicleInfo() {
		System.out.println("Invokes Vehicle::vehicleInfo()");
	}
}

class CarC extends VehicleC {
	void carInfo() {
		super.vehicleInfo();
		// Invokes Vehicle::vehicleInfo() through super reference
		System.out.println("Invokes Car::carInfo()");
	}
}

class ToyotaC extends CarC {
	@Override
	void carInfo() {
		System.out.println("Invokes Toyota::carInfo()");

	}

	void toyotaSpecial() {
		System.out.println("Invokes Toyota::toyotaSpecial()");
	}
}

class Maruti extends CarC {
	@Override
	void carInfo() {
		System.out.println("Invokes Maruti::carInfo()");
	}

	void marutiSpecial() {
		System.out.println("Invokes Toyota::marutiSpecial()");
	}

}

public class ObjectUpCastingEx1 {

	public static void main(String[] args) {

		System.out.println("Effect of Inheritance.......");
		ToyotaC carref1;// carref1 has been created as an instance of ToyotaC class
		// carref1 has not been assigned yet.
		carref1 = new ToyotaC();
// carref1 is assigned as a run-time object of : class ToyotaC

		System.out.println("The carref1 is a run-time object of : " + carref1.getClass());
		System.out.println("Is carref1 an instance of Car? " + (carref1 instanceof CarC));
		System.out.println("Is carref1 an instance of Toyota? " + (carref1 instanceof ToyotaC));

		System.out.println();

		System.out.println("Effect of UpCasting :: Please look carefully...");
		carref1.vehicleInfo(); // Invokes Vehicle::vehicleInfo()
		((CarC) carref1).vehicleInfo(); // Invokes Vehicle::vehicleInfo()
		((ToyotaC) carref1).vehicleInfo(); // Still Invokes Vehicle::vehicleInfo()
		((CarC) ((ToyotaC) carref1)).vehicleInfo(); // Still Invokes Vehicle::vehicleInfo()
		((ToyotaC) ((CarC) ((ToyotaC) carref1))).vehicleInfo();
// Still Invokes Vehicle::vehicleInfo()

		System.out.println();

		carref1.carInfo(); // Invokes Toyota::carInfo()
		((CarC) carref1).carInfo(); // Invokes Toyota::carInfo()
		((ToyotaC) carref1).carInfo(); // Still Invokes Toyota::carInfo()
		((CarC) ((ToyotaC) carref1)).carInfo(); // Still Invokes Vehicle::vehicleInfo()
		((ToyotaC) ((CarC) ((ToyotaC) carref1))).carInfo(); // Still Invokes Toyota::carInfo()

		System.out.println();

		carref1.toyotaSpecial(); // Invokes Toyota::toyotaSpecial()
		// ((Car)carref1).toyotaSpecial(); // Shows Compile-time Error
		// The method toyotaSpecial() is undefined for the type CarC
		((ToyotaC) carref1).toyotaSpecial(); // Still Invokes Toyota::toyotaSpecial()
		// ((Car)((Toyota)carref1)).toyotaSpecial(); // Shows Compile-time Error
		// The method toyotaSpecial() is undefined for the type CarC
		((ToyotaC) ((CarC) ((ToyotaC) carref1))).toyotaSpecial();
// Still Invokes Vehicle::vehicleInfo()
	}

}

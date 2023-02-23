package ch11InheritanceAndAbstraction;
// VehicleHierarchyEx1.java
interface VehicleB{
	boolean hasAnEngine= true;
	public void vehicleInfo();
}
class CarB implements VehicleB {
	String vehicleInfo;
	int  maxSpeed;
	int  maxCapacity;
	CarB(String carInfo){
		this.vehicleInfo = carInfo;
	}
	
	@Override
	public void vehicleInfo() {
		System.out.println("This is a " + this.vehicleInfo);
	}

}

class TruckB implements VehicleB {
	String vehicleInfo;
	int  maxSpeed=0;
	int  maxLoad=0;

	TruckB(String truckInfo){
		this.vehicleInfo = truckInfo;
	}

	@Override
	public void vehicleInfo() {
		System.out.println("This is a " + this.vehicleInfo);
	}

}

public class VehicleHierarchyEx1 {
	public static void main(String[]  args) {
		CarB myCar1 = new CarB("Toyota Camry 2016");
		myCar1.vehicleInfo();
		CarB myCar2 = new CarB("Maruti Swift 2015");
		myCar2.vehicleInfo();
		TruckB myTruck1 = new TruckB("Ford Focus-150 2016");
		myTruck1.vehicleInfo();

	}
}

package ch11InheritanceAndAbstraction;
// VehicleEngineEx1.java
	interface VehicleA{
		boolean hasAnEngine= true;
		public void vehicleInfo();
	}

	class EngineA {
		String engineInfo;
		EngineA (String engineType)
		{
			this.engineInfo = engineType;
		}

		void engineInfo(){
			if (this.engineInfo == null)
				System.out.println("Engine info is not available");
			else
				System.out.println("Engine info: " + this.engineInfo);
		}
	}

	class CarA implements VehicleA {
		String engineInfo;
		String carInfo;
		CarA (EngineA engineInfo, String carInfo){
			engineInfo = new EngineA(this.engineInfo);
			this.carInfo = carInfo ;
		}

		@Override
		public
		void vehicleInfo() {
			if (this.carInfo == null)
				System.out.println("Car info is not available");
			else
				System.out.println("Car info is : " + this.carInfo);
		}

	}

	public class VehicleEngineEx1 {
		public static void main(String[]  args) {

		EngineA 	myCarEngine= new EngineA("6-Cylinder Hybrid");
		CarA 	myCar = new CarA(myCarEngine, "Toyota Camry 2016");

		myCarEngine.engineInfo();
		myCar.vehicleInfo();

		System.out.println();
		EngineA my2ndCarEngine= new EngineA("4-Cylinder");
		CarA my2ndCar = new CarA(my2ndCarEngine, null);
		my2ndCarEngine.engineInfo();
		my2ndCar.vehicleInfo();

		System.out.println();
		EngineA myNextCarEngine= null;
		CarA myNextCar = new CarA(myNextCarEngine, null);
		myNextCar.vehicleInfo();

		// myNextCarEngine.engineInfo(); // NOT ALLOWED
		/* Null pointer access: The variable myNextCarEngine can only be null at this location
			 */
		}
	}

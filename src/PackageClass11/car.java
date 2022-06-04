package PackageClass11;

public class car {

	String model;
	String make;
	String colour;
	int year;
	String typeOfEngine;
	int noOfDoors;
	int HP;
	
	void MoveForward() {System.out.println("Car is moving forward");
	
	}
	
	void reverse () { System.out.println("Moving backwards");
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 car bmw=new car();
 bmw.model="X6";
 bmw.make="BMW";		
 bmw.colour="Black";		
 bmw.year=20022;	
 bmw.typeOfEngine="V8";	
	
 System.out.println(bmw.model);
 bmw.MoveForward();
 bmw.reverse();
	}

}

package PackageClass9;

public class taskTwoCars {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

		String [] cars={"BMW", "togg", "Tesla", "Astin Martin", "Kia", "Honda"};
		
		for (int vehicle=0; vehicle<cars.length; vehicle++ )
		{System.out.println(cars[vehicle]+" ");}
		
		for (String wheels:cars) {System.out.print(wheels+" ");}
	}}
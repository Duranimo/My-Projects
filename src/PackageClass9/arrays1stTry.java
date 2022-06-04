package PackageClass9;

public class arrays1stTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an array
	//int [] b;
	int [] b=new int[4];	
		
	// store values	
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;

		//access value from array
		System.out.println(b[2]);//70

		System.out.println(b[1]+b[3]); // 185
		
		
		
		//we need to create an array of my classmates
		// when we create an array we MUST specify the size (how many elements)
		String[] classMates=new String [5];
		//how values are stored>>stored based on index
		classMates[0]="Emre";
		classMates[1]="Adem";
		classMates[2]="Ramazan";
		classMates[3]="Duran";
		classMates[4]="Asel";

	System.out.println("My Favourite Friend is " +classMates[1]+ " and "+ classMates[4]);
	
	}}

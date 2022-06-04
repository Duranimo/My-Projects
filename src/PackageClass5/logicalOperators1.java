package PackageClass5;

public class logicalOperators1 {

	public static void main(String[] args) {
		
		//Logical Operators
		// 	and &&
		//	or ||
		//	not !
	
	boolean job=true;
	double salary=100000;
	
	if(job&&salary>=100000) { System.out.println("you have a very good job");}
	//if else (job&&salary<100000) { System.out.println("your pissed");}
	
	System.out.println("----------------------------------");
	
	boolean study=true, homework=true, practice=true;
	
	if (study&&homework&&practice) { System.out.println("you will seccees in the course");}
	else { System.out.println("you will struggle");}
	
	
	//------------------------------
	
	
	int no1=65;
	int no2=66;
	int no3=23;
	
	if (no1>no2 && no1>no3) { System.out.println("the largeat number is " +no1);}
	
	else if (no3>no1 && no3>no2) {
	 System.out.println("the largeat number is " +no3);}
	
	
	else if (no2>no1 && no2>no3) {
	 System.out.println("the largeat number is " +no2);}
	
	
	
	}

}

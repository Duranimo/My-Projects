package PackageClass5;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  Scanner loan=new Scanner(System.in);
	
	System.out.println("what is the amount of loan is needed");
	
	int needed=loan.nextInt();
	
	if (needed<=200000) { System.out.println("We can lend you the money");}
	else {System.out.println("Sorry your application has been rejected");}
	
	//---------------------------------------------------------------------------------------------------
	
	
	Scanner location=new Scanner(System.in);
	
	System.out.println("Please enter what city you are from ");
	
	String city=location.next();
	
	System.out.println("Please enter the temperature");
	
	int temperature=location.nextInt();
	
	int fehrenheit=((temperature-32)*5)/9;
	
	System.out.println("The temperature in the city " +city+" is "+fehrenheit);
	
	
	}

}

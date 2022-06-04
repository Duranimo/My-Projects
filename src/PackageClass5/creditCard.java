package PackageClass5;

import java.util.Scanner;

public class creditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner input=new Scanner(System.in);
	
	
	System.out.println("Do you have a credit card?");
	
	
	boolean yes=input.nextBoolean();
	
	if (yes==false) {System.out.println("Would you like a credit card?");}
		
	
	
	else if (yes==true) ;
	
				System.out.println("What is the balance on your credit card");		
				Double balance=input.nextDouble();
	
		if (balance>=1000) { System.out.println("You need to pay off your debt");
			} 
			
			else System.out.println("Spend more");
	
	
	
	
	
	
	
	
	
	
	}

}

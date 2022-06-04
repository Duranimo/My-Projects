package PackageClass8;

import java.util.Scanner;

public class homeWork5 {

		public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
	
System.out.println("Please type in the item you will like to purchase");
		String item=inp.nextLine();
	System.out.println("Please enter the price of the item you would like");
	double price=inp.nextDouble(); 
		
	
	// 
	
	double paidTotal=0;
	while (paidTotal < price) {
		
		System.out.println("Please make a payment");
		double payment=inp.nextDouble();
		
		paidTotal+=payment; 
		
	 if (paidTotal==price) {
		System.out.println("Thanks for payment");
		 
	} if (paidTotal>price) { 
		double change = paidTotal- price;
		System.out.println("Your change is "+change);
	}}
	}}

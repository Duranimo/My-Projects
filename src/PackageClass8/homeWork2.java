package PackageClass8;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {
		//keep asking user to apply for a credit card. As soon you get “yes” from a user program should stop asking.
		// ALL LOOPS

		Scanner inp=new Scanner(System.in);
		
	/*	
		String answer="null";
		
		while (!answer.equalsIgnoreCase ("yes")) {
			System.out.println("Apply for a credit card");
		answer=inp.nextLine();
		
		}	System.out.println("thanks");
		
	*/
		
	/*	String answer="null";
		do{System.out.println("Apply for a credit card");
		answer=inp.nextLine();}
		while (!answer.equals("yes"));
		System.out.println("Thanks");
		*/
		
		
		for (String answer="null"; !answer.equalsIgnoreCase("yes");) {
				System.out.println("Appy for a credit card"); 
				 answer = inp.nextLine();
				} System.out.println("Too late");
		
		
		
		
		
		
		
		
		
}}

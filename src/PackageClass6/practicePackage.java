package PackageClass6;

import java.util.Scanner;

public class practicePackage {

	public static void main(String[] args) {


		
		
		
		
		
	    Scanner mood=new Scanner (System.in);

	    System.out.println("Are you thirsty?");
	        boolean answer=mood.nextBoolean();

	    System.out.println("Are you sleepy?");
	        boolean answer2=mood.nextBoolean();

	    String drink;

	        
	    if         (answer && !answer2){
	                                              drink="water";}

	    else if    (answer && answer2){
	                                              drink="coffee";}

	    else if    (answer==false&&answer2==true) {
	                                              drink="tea";}




	        
	        	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}

package PackageClass5;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner workExp=new Scanner (System.in);
	
	
	System.out.println("how many years have you worked?");
    int yearsXp=workExp.nextInt();
    
    if (yearsXp>=5) {System.out.println("user is eligible for bonus");
	System.out.println("what is you anual salary");
    int earnings=workExp.nextInt();
	if (earnings>50000) {System.out.println("bonus = 5000");}
	else {System.out.println("otherwise bonus 3000");}}
	
	
	else {System.out.println("is not eligible"); }
	
//--------------------------------------------------------------------------------------
    Scanner clock=new Scanner (System.in);
    
    System.out.println("what is the time");
    
    float time=clock.nextFloat();
    
    if 			(time>1&&time<11) 		{System.out.println("Morning");}
   else if 		(time>=11&&time<15) 	{System.out.println("Afternoon");}
   else if		(time>=15&&time<20)		{System.out.println("Evining");}
   else if		(time>=20&&time<24)		{System.out.println("Night");}
   else 								{System.out.println	("Not valid a time");}
    
    
	}

}

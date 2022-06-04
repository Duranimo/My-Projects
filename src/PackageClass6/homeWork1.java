package PackageClass6;

import java.util.Scanner;

public class homeWork1 {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
		System.out.println("What Country are you from?");
		String theyreFrom=inp.next();
		String language=(null);
		
		switch (theyreFrom) {
		case "Turkey": 		language="Turkish"; 	break;
		case "Itally": 		language="Italian"; 	break;
		case "Russia": 		language="Russian"; 	break;
		case "Pakistan": 	language="Urdu"; 		break; 
		case "China":		language="Chinese"; 	break;
		case "Palestine":	language="Arabic"; 		break;
		case "England":		language="gibberish"; 	break;
		default:			language=" not found in our system";
		}
		
		System.out.println("The language you speak is "+language+".");
		
	}}

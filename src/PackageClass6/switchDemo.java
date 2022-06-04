package PackageClass6;

import java.util.Scanner;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	String country, favoriteFood;
	
	System.out.println("Please tell me where you are from");
	
	country=scan.nextLine();
	
	switch (country.toLowerCase()) {
	
	case "mexico":
		favoriteFood="tacos"; 		break;
	case "canada":
		favoriteFood="poutine";		break;
	case "turkey":
		favoriteFood="lahmacun";	break;
	case "pakistan":
		favoriteFood="pati chai";	break;
	case "america":
		favoriteFood="burger";		break;
		
	default:
		favoriteFood="Unknown"; break;    }
		
		
	System.out.println("Youre from "+country+" and your favourite food is "+favoriteFood);	
		
		//System.out.println("Tell me your favorite food");
	//favoriteFood=scan.
	

	
	}

}

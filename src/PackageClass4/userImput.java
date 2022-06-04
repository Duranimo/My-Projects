package PackageClass4;

import java.util.Scanner;

public class userImput {

	public static void main(String[] args) {
		// creating a scanner

	
		Scanner input=new Scanner(System.in);
		
		//send instructio to the console
		System.out.println("Please enter your name");
		 
		// we need to grab the value from console
		String name=input.next(); //String name = "Duran"
		System.out.println(name);
		
		
		 System.out.println(name+" Please enter your age"); 
		int age=input.nextInt(); // int age=25
		
		System.out.println(name +" is "+age +" years old");
		
		System.out.println("Now please verify your nationality");
		 
		String nate=input.next();
		
		System.out.println("We understand that your name is "+name+ " and you are "+age+" years old. You are "+nate);
	}

}




import java.util.Scanner;
class Main {

  public static void main(System[] args){

  Scanner input=new Scanner(System.in);


  System.out.println("Enter your age ");

  int age=input.nextInt();

  System.out.println("Your age after 10 years is "+(age+10));
  
}
  

}

package PackageClass5;

import java.util.Scanner;

public class scanningPractice {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Please enter name");
        String name=inp.nextLine();
        System.out.println("Please enter age");
		int age=inp.nextInt();
		
		System.out.println("Please enter price");
		double price= inp.nextDouble();
		
		System.out.println("Please enter boolean");
		boolean boo=inp.nextBoolean();
		
		System.out.println("Please enter any charecter");
		char ch=inp.next().charAt(0);
		
		System.out.println(ch);
	
	
	
	
	
	}

}

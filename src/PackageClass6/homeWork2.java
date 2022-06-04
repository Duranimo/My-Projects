package PackageClass6;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		char result=inp.next().charAt(0);
		String explinatioin=(null);		
		
		switch (result) {
		case 'A': 	explinatioin="Excellent";	break;
		case 'B':	explinatioin="Very Good";	break;
		case 'C':	explinatioin="Good";		break;
		case 'D':	explinatioin="Average";		break;
		case 'E':	explinatioin="Bad";			break;
		case 'F':	explinatioin="Failed";		break;
		case 'U':	explinatioin="Unattended";	break;
		default:	explinatioin="Unknown grade";
		}
		
		System.out.println("Your grade is "+result+" and that stands for "+explinatioin+".");
	}}

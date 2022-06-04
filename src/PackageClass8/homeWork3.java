package PackageClass8;

import java.util.Scanner;

public class homeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		
		
	System.out.println("please enter a start number");
		int start=inp.nextInt();
	System.out.println("please enter an end number");
		int end=inp.nextInt();
		
		int evens=0, odds=0;
		
		for (int answer=start; answer<=end; answer++) {
		if (answer%2==0) {evens=answer+evens;
			
		} else  odds=answer+odds;}
		
		System.out.println("the total of all your odd numbers are "+odds+".");
		System.out.println("the total of all your even numbers are "+evens+".");
		
}}

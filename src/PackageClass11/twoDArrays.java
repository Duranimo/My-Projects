package PackageClass11;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner inp=new Scanner(System.in);
	
	System.out.println("Please Enter this size of the array that you want to create");
	int arraySize=inp.nextInt();
	
	
	System.out.println("the size of the array is "+ arraySize);
	int [] integerArray=new int [arraySize];
	
	System.out.println("Please enter "+arraySize+" elements");
	
	for (int i=0; i<integerArray.length; i++) {
		integerArray[i]=inp.nextInt();
	}
	
	System.out.println(Arrays.toString(integerArray));
	
	
	int sum=0;
	for(int element:integerArray) {
		sum=sum+element;
	}
	
	System.out.println("The sum of all the elements is "+sum);
	inp.close();
	}

}

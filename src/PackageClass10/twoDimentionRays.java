package PackageClass10;

public class twoDimentionRays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		int[] [] numbers=new int[3][4];
	    //row 1
	    numbers[0] [0] = 10;
	    numbers[0] [1] = 20;	
	    numbers[0] [2] = 30;	
	    numbers[0] [3] = 40;	
		// row 2	
	    numbers[1] [0] = 1;
	    numbers[1] [1] = 2;	
	    numbers[1] [2] = 3;	
	    numbers[1] [3] = 4;		
		// row 3	
	    numbers[2] [0] = 9;
	    numbers[2] [1] = 8;	
	    numbers[2] [2] = 7;	
	    numbers[2] [3] = 6;	
			
			System.out.println(numbers[1] [3]);
			
			System.out.println(numbers.length); // this is the length of rows
			
			int rows=numbers.length;   //   same sh**
			System.out.println(rows);  //
			
			//--------------colums
			
			
			System.out.println(numbers[0].length); // colunms
			
			int columns=numbers[0].length;
			System.out.println(columns);
			
			System.out.println("----------------------------");
	
	
			
			
			
	
	
	
	
	
	
	}

}

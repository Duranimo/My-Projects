package PackageClass11;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		int x=10;
		boolean isPrime=true;
		
		
		if (x>1) {
			
			for (int i=2; i<x; i++) {
				if (x%i==0) {
					isPrime=false;
				}
			}
			
		}else {
			isPrime=false;
			
		}
if (isPrime) {
	System.out.println(x+ " is prime");
}else {
	System.out.println(x+ " is not Prime");
}
	}
}


		
	
	
	
	
	
	
	
	
	
	
	



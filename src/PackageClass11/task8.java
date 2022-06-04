package PackageClass11;

public class task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
int[]arr= {10,20,50,3,8};
		
		int maxNumber=arr[0];
		int minNumber=arr[0];
		
		for(int num:arr) {
			
			if(num>maxNumber) {
				maxNumber=num;
			}
			if(num<minNumber){
				minNumber=num;
			}
		
		}
		System.out.println(maxNumber);
		System.out.println(minNumber);
	}
New



// Maximum and minimum number in the array?
		int[] arr= {10,20,50,5,8};
		
		int maxNumber=arr[0];
		int minNumber=arr[0];
		
		for(int num:arr) {
			
			if(num>maxNumber) {
				maxNumber=num;
			}
			if(num<minNumber) {
				minNumber=num;
			}
		}
		
		System.out.println(maxNumber);
		System.out.println(minNumber);
	
	
	
	}

}

package PackageClass9;

public class nestedLoopClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String aa=null;
		
	for (int a=1; a<=2; a++) {
		if (a==1) {aa="am";} else if(a==2) {aa="pm";}
		
		for (int hours=0; hours<=12; hours++) {
			
			for (int minutes=0; minutes<60; minutes++) {
				
				for (int seconds=0; seconds<60; seconds++){
	System.out.println("the time is: " +  +hours+":"+minutes+":"+seconds+aa);}}}}
			
	
	
	
	
	

}}

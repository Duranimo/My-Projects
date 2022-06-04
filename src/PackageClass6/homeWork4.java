

	package PackageClass6;

	import java.util.Scanner;

	public class homeWork4 {

		public static void main(String[] args) {
		Scanner inp=new Scanner (System.in);
		
		System.out.println("Please enter a number");
		double firstNo=inp.nextDouble();
		System.out.println("Please enter action");
		char action=inp.next().charAt(0);
		System.out.println("Please enter another number");
		double secondNo=inp.nextDouble();	
			
		double answer='0';
		
		switch (action){
			
			case	'+': 	answer=		(firstNo+secondNo); 	break;
			case	'-':	answer=		(firstNo-secondNo);		break;
			case	'*':	answer=		(firstNo*secondNo);		break;
			case	'/':	answer=		(firstNo/secondNo);		break;
			}
		
		System.out.println	(answer);
			
		}}




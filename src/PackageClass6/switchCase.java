package PackageClass6;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			char choice='M';
		String meaning;
			
			switch (choice) {
	
			case 'Y':
		meaning="Yes";
			break;
			case 'M':
		meaning="Maybe";
			break;
			case 'N':
		meaning="No";
			break;
			default : 
		meaning ="Unknown";
			
			}System.out.println(meaning);	
	}

}

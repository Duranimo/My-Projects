package PackageClass8;

public class homeWork1 {

	public static void main(String[] args) {
		//Print numbers from 1 to 50 except those that are divisible by 3

	int no=1;
	
	while (no<=50) 
	{no++; if (no%3!=0) {System.out.print(no+" ");}}
	
	int no2=1;
	do {if (no2%3!=0)System.out.println(no2);  no2++;} while(no2<=50);
	
	
	for (no=0; no<=50; no++) {if(no%3==0)continue ; System.out.println(no);}
	
	}}

package Package2;

public class Practice {

	public static void main(String[] args) {
		// you go to a shop with 20 pounds. Yu buy 4 things in the shop, how much change do you have.
		
		
		float sneakers, bounty, chocolate, sweets, change, own, split, bracelet, multipack;
		
		sneakers=1.10f;
		bounty=1.30f;
		chocolate=3.00f;
		sweets=2.00f;
		change=20.00f-sneakers-bounty-chocolate-sweets;
		
		//String verse1="i went to the shop and bought a sneakers worth ", verse2=", a bounty worth ", verse3= " a chocolate worth " , verse4=" and some sweets for ", verse5=" so my change was ";
			
		
		//System.out.println(verse1+sneakers+verse2+bounty+verse3+chocolate+verse4+sweets+verse5+change);
		
		
		System.out.println("i went to the shop and bought a sneakers worth " +sneakers+ " a bounty worth " +bounty+ " some chocolate worth "+chocolate+ " and some sweets for " +sweets+ " so my change was "+change);
		
	//how much change will you have from a £20 if you buy sneakers and bounty together
		
		
		change=20.00f-sneakers-bounty;
		
		System.out.println("from £20 I will have £"+change+" left after buying a sneakers and a bounty");
		
		
		
		
		//if you have £2000, and you have to divide between 5 people, how much will each person have? Please give £s

		own=2000.00f;
		split= own/5;
		char currency='£';
		
	
		
		System.out.println("if "+currency + own+ " was split with 5 people that would leave each person with "+currency+split);
		
		
		
		
		
	//If bracelets cost £25.55 each, how many will 3 bracelets cost
		
		bracelet=25.55f;
		multipack=4*bracelet;
		
		System.out.println("its a total of "+currency+multipack+ " when 4 bracelets have been bought");
	
		
		int old=4;
		
	
		
		System.out.println(old );
		
		
		
		
		
	}

}

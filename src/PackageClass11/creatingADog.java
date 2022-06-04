package PackageClass11;

public class creatingADog {

	
	
	
	//how object looks
	
	String name;
	int age;
	double weight;
	String colour;
	double height;
	String breed;
	
	//how object behaves
	
	void bark() {
		System.out.println("Dog barks");
	}
	void walks() {
		System.out.println("Dog walks");
	}
	void eat() {
		System.out.println("Dogs eat bones");
	}
	
	public static void main(String[] args) {
		
	
	creatingADog Jigsaw=new creatingADog();
			
	
	
			Jigsaw.name="Jigsaw";
			Jigsaw.age=6;
			Jigsaw.weight=16;
			Jigsaw.colour="pink";
			Jigsaw.height=2.6;
			Jigsaw.breed="German";
	
			
			Jigsaw.bark();
			Jigsaw.walks();
			//Jigsaw."dog eats bone"();
			
			
			
			
	}
	
}

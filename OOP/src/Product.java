// Class
public class Product {

	//Property
	public String name; 
	public int price;
	public int totalPrice; 
	
	//Constructors

	public Product() {
		System.out.println("Instructor");
	}
	
	public Product(String name) {
		System.out.println("In constructor ");
		this.name = name;
	}

	//Methods
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public (String name) {
		this.name = name;
		System.out.println("In constructor met naam " + name);
	
		
	}
	
	public String description() {
		String a = "Naam is " + name + " en prijs is " + price;
		return a;
				
		// alles onder de return wordt nooit uitgevoerd en dus mag niet!
		// return "Naam is " + name + " en prijs is " + price
	}

	
	
}

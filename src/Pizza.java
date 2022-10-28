
public class Pizza {
	private String description;
	private int price; 
	
	public Pizza(String desc, int pr) {
		description = desc;
		price = pr;
		
		
	}
	public void display() {
		System.out.println("this is what kind of pizza" + description + "here is the price" + price );
		
	}

}

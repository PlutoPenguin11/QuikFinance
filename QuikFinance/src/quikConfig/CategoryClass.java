package quikConfig;
//this is the class for creating categories for whatever you are buying !!!????
//
public class CategoryClass {
	private int totalCost;
	private int ID;
	private String itemCategory = null;
	
	public CategoryClass(int ID, String itemcategory, int totalCost) {
		this.totalCost = totalCost;
		this.itemCategory = itemcategory;
		this.ID = ID;
	}
	public int getID() {
		return this.ID;
	}
	
	public int getPrice() {
		return this.totalCost;
	}
	
	public String getCategory() {
		return this.itemCategory;
	}
	public void printInfo() {
		System.out.println("Item ID:       "+ getID());
		System.out.println("Item category: "+getCategory());
		System.out.println("Total cost:    $"+getPrice());
	}
}

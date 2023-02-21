package quikConfig;
//this is the class for creating categories for whatever you are buying !!!????
public class CategoryClass {
	private int itemPrice;
	private String itemCategory = null;
	public CategoryClass(String itemCategory, int itemPrice) {
		this.itemPrice = itemPrice;
		this.itemCategory = itemCategory;
	}
	
	public int getPrice() {
		return this.itemPrice;
	}
	
	public String getCategory() {
		return this.itemCategory;
	}
	
	public void printInfo() {
		System.out.println(getPrice());
		System.out.println(getCategory());
	}
}

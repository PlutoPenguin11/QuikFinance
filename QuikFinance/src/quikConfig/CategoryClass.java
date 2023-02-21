package quikConfig;
//this is the class for creating categories for whatever you are buying !!!????
public class CategoryClass {
	private int itemPrice;
	private String itemType = null;
	public CategoryClass(String itemType, int itemPrice) {
		this.itemPrice = itemPrice;
		this.itemType = itemType;
	}
	
	public int getPrice() {
		return this.itemPrice;
	}
	
	public String getType() {
		return this.itemType;
	}
	
	public void printCategory() {
		System.out.println(getPrice());
		System.out.println(getType());
	}
}

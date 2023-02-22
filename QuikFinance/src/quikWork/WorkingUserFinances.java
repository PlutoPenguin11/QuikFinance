package quikWork;
import quikConfig.CategoryClass;
//main classs//
public class WorkingUserFinances {

	public static void main(String[] args) {
		CategoryClass item1 = new CategoryClass(5,"entertainment",10);
		item1.printInfo();
		System.out.println();
		CategoryClass item2 = new CategoryClass(7,"water bill", 200);
		item2.printInfo();
		System.out.println();
		CategoryClass item3 = new CategoryClass(3,"Car insurance", 80);
		item3.printInfo();
	}

}


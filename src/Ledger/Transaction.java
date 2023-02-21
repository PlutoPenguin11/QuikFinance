package Ledger;

public class Transaction {
    //Could store as ID or as string
    private Category category;
    //TODO: Decide specific data type for price
    //maybe store as int in cents and divide when displaying
    protected int price;
    private String date;
    private String description;
    private boolean wasPaid;

    public Transaction(Category category, double price, String date, boolean wasPaid) {
        this.category = category;
        this.price = (int) price * 100; //Typecast to int to maybe minimize memory leaks?
        this.date = date;
        this.wasPaid = wasPaid;
        this.description = "Transaction for " + category.name;
    }

    public Transaction(Category category, double price, String date, boolean wasPaid, String description) {
        this.category = category;
        this.price = (int) price * 100; //Typecast to int to maybe minimize memory leaks?
        this.date = date;
        this.wasPaid = wasPaid;
        this.description = description;
    }

    //TODO: Decide if delete
    /*public Transaction(String category, int price, String date) {
        this.category = category;
        this.price = price;
        this.date = date;
    }*/

    public void setCategory(Category newCategory) {
        category = newCategory;
    }

    //Precondition: String is a valid date
    public void setDate(String newDate) {
        date = newDate;
    }

    //TODO: Maybe input as string. Need to decide.
    //Input is same as constructor. Stores as int in number of cents.
    public void setPrice(double newPrice) {
        price = (int) newPrice * 100;
    }

    public void setStatus(boolean newStatus) {
        wasPaid = newStatus;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    //Converts cents back to $x.xx format and returns
    //TODO: Double check right indexes
    public String getPrice() {
        String money = "" + (price * 100);
        String dollars = money.substring(0, money.length() - 2);
        String cents = money.substring(money.length() - 2);
        return "$" + dollars + "." + cents;
    }

    public Category getCategory() {
        return category;
    }

    //TODO: Convert to category string
    public String getCategoryName() {
        return category.name;
    }

    public String getDate() {
        return date;
    }

    public boolean getStatus() {
        return wasPaid;
    }

    public String getDescription() {
        return description;
    }
}

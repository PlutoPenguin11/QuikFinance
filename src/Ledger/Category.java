package Ledger;

public class Category {
    protected String name;
    private int ID;
    private int totalCost;

    public Category(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    //Precondition: newTransaction is not null
    public void addTransaction(Transaction newTransaction) {
        totalCost += newTransaction.price;
    }

    //Precondition: newTransaction is not null
    public void removeTransaction(Transaction newTransaction) {
        totalCost -= newTransaction.price;
    }

    public void setTotalCostPennies(int amount) {
        totalCost = amount;
    }

    public void setTotalCostDollars(double amount) {
        totalCost = (int) amount * 100;
    }

    public String getTotalCost() {
        String money = "" + (totalCost * 100);
        String dollars = money.substring(0, money.length() - 2);
        String cents = money.substring(money.length() - 2);
        return "$" + dollars + "." + cents;
    }

    public int getTotalCostInt() {
        return totalCost;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}

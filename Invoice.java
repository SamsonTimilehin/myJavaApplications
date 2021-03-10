package chapterFour;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }
    public String getPartNumber(String partNumber){
        return partNumber;
    }
    public String getPartDescription(String partDescription) {
        return partDescription;
    }
    public void setQuantity(int quantity) {
        if(quantity > 0)
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        if(price > 0)
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
    public double getInvoiceAmount( int quantity, double price){
     double invoiceAmount = quantity * price;
     return invoiceAmount;
    }
}


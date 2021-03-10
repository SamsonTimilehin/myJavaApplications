package chapterFour;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("002", " Executive Chairs", 10, 5000);

        System.out.printf("INVOICE %n%s %s %s ",invoice1.getPartNumber("0003"), invoice1.getPartDescription("10 Chairs"), invoice1.getInvoiceAmount( 10, 3000));
    }
}

package Chapter_Seven;



public class TotalSales {
    int[][] salesValue = new int[5][4];
    private int totalAmount;

    public void collectSalesPerson1SalesValues(String productNumber, int productAmount) {

        if (productNumber.equals("p1") && productAmount > 0) {
            salesValue[0][0] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p2") && productAmount > 0) {
            salesValue[1][0] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p3") && productAmount > 0) {
            salesValue[2][0] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p4") && productAmount > 0) {
            salesValue[3][0] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p5") && productAmount > 0) {
            salesValue[4][0] = productAmount;
            totalAmount += productAmount;
        } else throw new IllegalArgumentException("Invalid Input");
    }

    public int getSalesPerson1SalesValues() {
        return totalAmount;
    }

    public void collectSalesPerson2SalesValues(String productNumber, int productAmount) {
        if (productNumber.equals("p1") && productAmount > 0) {
            salesValue[0][1] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p2") && productAmount > 0) {
            salesValue[1][1] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p3") && productAmount > 0) {
            salesValue[2][1] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p4") && productAmount > 0) {
            salesValue[3][1] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p5") && productAmount > 0) {
            salesValue[4][1] = productAmount;
            totalAmount += productAmount;
        } else throw new IllegalArgumentException("Invalid Input");
    }

    public int getSalesPerson2SalesValues() {
        return totalAmount;
    }

    public void collectSalesPerson3SalesValues(String productNumber, int productAmount) {
        if (productNumber.equals("p1") && productAmount > 0) {
            salesValue[0][2] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p2") && productAmount > 0) {
            salesValue[1][2] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p3") && productAmount > 0) {
            salesValue[2][2] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p4") && productAmount > 0) {
            salesValue[3][2] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p5") && productAmount > 0) {
            salesValue[4][2] = productAmount;
            totalAmount += productAmount;
        } else throw new IllegalArgumentException("Invalid Input");
    }

    public int getSalesPerson3SalesValues() {
        return totalAmount;
    }

    public void collectSalesPerson4SalesValues(String productNumber, int productAmount) {
        if (productNumber.equals("p1") && productAmount > 0) {
            salesValue[0][3] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p2") && productAmount > 0) {
            salesValue[1][3] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p3") && productAmount > 0) {
            salesValue[2][3] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p4") && productAmount > 0) {
            salesValue[3][3] = productAmount;
            totalAmount += productAmount;
        } else if (productNumber.equals("p5") && productAmount > 0) {
            salesValue[4][3] = productAmount;
            totalAmount += productAmount;
        } else throw new IllegalArgumentException("Invalid Input");

    }


    public int getSalesPerson4SalesValues() {
        return totalAmount;
    }
}
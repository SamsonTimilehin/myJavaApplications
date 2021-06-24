package ChapterSeven;

import Chapter_Seven.TotalSales;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TotalSalesTest {
    TotalSales sales;

    @BeforeEach
    void allTestStartWithThis() {
        sales = new TotalSales();
    }

    @Test
    void testThatSalesObjectCanBeCreated() {
        TotalSales sales = new TotalSales();
        assertNotNull(sales);
    }

    @Test
    void testThatSalesValueCanBeCollected() {
        sales.collectSalesPerson1SalesValues("p1", 5000);
        assertEquals(5000, sales.getSalesPerson1SalesValues());
    }

    @Test
    void testThatSalesPerson1SalesValueForProductsCanBeCollected() {
        sales.collectSalesPerson1SalesValues("p1", 1000);
        sales.collectSalesPerson1SalesValues("p2", 3000);
        sales.collectSalesPerson1SalesValues("p3", 5000);
        sales.collectSalesPerson1SalesValues("p4", 6000);
        sales.collectSalesPerson1SalesValues("p5", 2000);
        assertEquals(17000, sales.getSalesPerson1SalesValues());

    }

    @Test
    void testThatSalesPerson2SalesValueForProductsCanBeCollected() {
        sales.collectSalesPerson2SalesValues("p1", 1000);
        sales.collectSalesPerson2SalesValues("p2", 300);
        sales.collectSalesPerson2SalesValues("p3", 1000);
        sales.collectSalesPerson2SalesValues("p4", 6000);
        sales.collectSalesPerson2SalesValues("p5", 2000);
        assertEquals(10300, sales.getSalesPerson2SalesValues());
    }

    @Test
    void testThatSalesPerson3SalesValueForProductsCanBeCollected() {
        sales.collectSalesPerson3SalesValues("p1", 1000);
        sales.collectSalesPerson3SalesValues("p2", 300);
        sales.collectSalesPerson3SalesValues("p3", 100);
        sales.collectSalesPerson3SalesValues("p4", 600);
        sales.collectSalesPerson3SalesValues("p5", 2000);
        assertEquals(4000, sales.getSalesPerson3SalesValues());
    }

    @Test
    void testThatSalesPerson4SalesValueForProductsCanBeCollected() {
        sales.collectSalesPerson4SalesValues("p1", 4000);
        sales.collectSalesPerson4SalesValues("p2", 300);
        sales.collectSalesPerson4SalesValues("p3", 100);
        sales.collectSalesPerson4SalesValues("p4", 600);
        sales.collectSalesPerson4SalesValues("p5", 2000);
        assertEquals(7000, sales.getSalesPerson4SalesValues());
    }

    @Test
    void testThatSalesPersonCannotInputDifferentProductTypeOtherThanTheSpecified() {
        sales.collectSalesPerson4SalesValues("p1", 10);
        sales.collectSalesPerson4SalesValues("p2", 300);
        sales.collectSalesPerson4SalesValues("p3", 100);
        sales.collectSalesPerson4SalesValues("p4", 600);
        sales.collectSalesPerson4SalesValues("p5", 2000);
        assertThrows(IllegalArgumentException.class, () -> sales.collectSalesPerson1SalesValues("p6", 400));
    }
    @Test
    void testThatSalesPersonCannotInputNegativeAmount() {
        sales.collectSalesPerson4SalesValues("p3", 100);
        sales.collectSalesPerson4SalesValues("p4", 600);
        sales.collectSalesPerson4SalesValues("p5", 2000);
        assertThrows(IllegalArgumentException.class, () -> sales.collectSalesPerson1SalesValues("p4", -400));
    }
}
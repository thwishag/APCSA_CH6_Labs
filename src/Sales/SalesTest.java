package Sales;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest
{

    @org.junit.jupiter.api.Test
    void average()
    {
        assertEquals(7.0, Sales.average(new int[] {3,4,1,23,4}),0.00001);
        assertEquals(27.2, Sales.average(new int[] {13,42,53,7,21}), 0.00001);
    }

    @org.junit.jupiter.api.Test
    void averageOtherLengths()
    {
        assertEquals(10.0, Sales.average(new int[] {3,23,4}),0.00001);
        assertEquals(38.5, Sales.average(new int[] {13,42,53,7,21,95}), 0.00001);
    }

    @org.junit.jupiter.api.Test
    void averageIllegalState()
    {
        Throwable exception = assertThrows(IllegalStateException.class, () -> {
            Sales.average(new int[] {});
        });
    }

    @org.junit.jupiter.api.Test
    void indexOfMax()
    {
        assertEquals(3, Sales.indexOfMax(new int[] {3,4,1,23,0}));
        assertEquals(0, Sales.indexOfMax(new int[] {33,14,10,-23,0}));
    }

    @org.junit.jupiter.api.Test
    void indexOfMaxOtherLengths()
    {
        assertEquals(1, Sales.indexOfMax(new int[] {3,23,0}));
        assertEquals(5, Sales.indexOfMax(new int[] {33,14,10,-23,0, 56}));
    }

    //TODO 3c) Uncomment the following lines to test the indexOfMin method
    @org.junit.jupiter.api.Test
    void indexOfMin()
    {
        assertEquals(4, Sales.indexofMin(new int[] {3,4,1,23,0}));
        assertEquals(3, Sales.indexofMin(new int[] {33,14,10,-23,0}));
    }

    @org.junit.jupiter.api.Test
    void indexOfMinOtherLengths()
    {
        assertEquals(2, Sales.indexofMin(new int[] {3,23,0}));
        assertEquals(3, Sales.indexofMin(new int[] {33,14,10,-23,0, 56}));
    }


}
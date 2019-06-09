package test;

import arithmetics.Calculations;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class TestCalculations {
    private static Calculations calculations;

    @Rule
    public final ExpectedException ee = ExpectedException.none();

    @BeforeClass
    public static void runCalc(){
        calculations = new Calculations();
    }

    @Test
    public void testAdd(){
        double result = calculations.add(3, 7);
        Assert.assertEquals(result, 10.0, 0.00001);
    }

    @Test
    public void testDeduct(){
        double result = calculations.deduct(7, 3);
        Assert.assertEquals(result, 4.0, 0.00001);
    }

    @Ignore
    @Test
    public void testMult(){
        double result = calculations.mult(7, 3);
        Assert.assertEquals(result, 21.0, 0.00001);
    }

    @Test
    public void testDiv(){
        double result = calculations.div(100, 20);
        Assert.assertEquals(result, 5.0, 0.00001);
    }

//    @Test(expected = NullPointerException.class)
    @Test
    public void testDivException(){
        ee.expect(NullPointerException.class);
        calculations.div(10.0, 0.0);
    }


}

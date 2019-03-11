package mixed.project;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testPlus(){
        Assert.assertEquals(5, Calculator.plus(3, 2));
    }

    @Test
    public void testKotlinCalculator(){
        Assert.assertEquals(5, KotlinCalculator.INSTANCE.plus(3, 2));
    }
}

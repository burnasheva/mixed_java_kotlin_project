package org.test2;

import kotlin.collections.AbstractList;
import org.junit.Assert;
import org.junit.Test;
import org.test1.KotlinCalculator;

public class CalculatorTests {
    @Test
    public void testPlus(){
        kotlin.collections.AbstractList<KotlinCalculator> some = testKotlinCalculator();
        Assert.assertEquals(5, JavaCalculator.plus(3, 2));
    }

    @Test
    public AbstractList<KotlinCalculator> testKotlinCalculator(){
        Assert.assertEquals(5, KotlinCalculator.INSTANCE.plus(3, 2));
        return null;
    }
}

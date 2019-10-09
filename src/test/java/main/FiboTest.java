package main;

import org.junit.Assert;
import org.junit.Test;

public class FiboTest {

    @Test
    public void calculationResult() {
        int in = 6;
        int expected = 8;
        int out = new Fibo().calculationResult(in);
        Assert.assertEquals(expected, out);
    }
}

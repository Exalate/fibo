package main;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class FiboTest {

    @Test
    public void calculationResult() {
        int in = 6;
        int expected = 8;
        BigInteger out = new Fibo().calculationResult(in);
        Assert.assertEquals(expected, out);
    }
}

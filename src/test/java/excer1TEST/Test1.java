package excer1TEST;

import org.testng.Assert;
import org.testng.annotations.Test;

import excer1package.Class;

public class Test1 {

    @Test
    public void testFailCase() {
        String result = Class.display(35);
        Assert.assertEquals(result, "fail");
    }

    @Test
    public void testPassCase() {
        String result = Class.display(55);
        Assert.assertEquals(result, "pass");
    }
}

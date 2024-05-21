package Tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetKittenParamTest {
    private final int count;

    public FelineGetKittenParamTest(int count) {
        this.count = count;
    }

    @Parameterized.Parameters
    public static Object[] counts() {
        return new Object[]{0, 1, 2, 3,};
    }

    @Test
    public void testGetKittensWithArguments() {
        Feline feline = new Feline();
        Assert.assertEquals(count, feline.getKittens(count));
    }
}

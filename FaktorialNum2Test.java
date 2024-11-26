import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FaktorialNum2Test {

    @Test
    public void testForZero() {
        assertEquals(FaktorialNum2.faktorialNum2(0), 1);
    }

    @Test
    public void testForPositiveNum() {
        assertEquals(FaktorialNum2.faktorialNum2(1), 1);
        assertEquals(FaktorialNum2.faktorialNum2(7), 5040);
    }

    @Test
    public void testAxcept() {
        Assert.assertThrows(IllegalArgumentException.class, () -> FaktorialNum2.faktorialNum2(-2));

    }


}

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by cchen on 12/25/13.
 */
public class PrimerCounterTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void primer_factor_1() {
        PrimerCounter primer = new PrimerCounter(1);
        Assert.assertEquals(1,primer.getFactor());
    }


}

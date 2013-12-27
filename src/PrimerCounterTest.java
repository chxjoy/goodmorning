import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by cchen on 12/25/13.
 */
public class PrimerCounterTest {
    private String foo;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void primer_factor_1() {
        PrimerCounter primer = new PrimerCounter(1);
        Assert.assertEquals(Arrays.asList(new Integer[]{1}),primer.getFactor());
    }

    @Test
         public void primer_factor_2() {
        PrimerCounter primer = new PrimerCounter(2);
        Assert.assertEquals(Arrays.asList(new Integer[]{2}),primer.getFactor());
    }

    @Test
    public void primer_factor_3() {
        PrimerCounter primer = new PrimerCounter(3);
        Assert.assertEquals(Arrays.asList(new Integer[]{3}),primer.getFactor());
    }

    @Test
    public void primer_factor_4() {
        PrimerCounter primer = new PrimerCounter(4);
        Assert.assertEquals(Arrays.asList(new Integer[]{2,2}),primer.getFactor());
    }


}

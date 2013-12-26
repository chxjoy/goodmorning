import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cchen on 12/25/13.
 */
public class PrimerCounter {

    List<Integer> primer_factors = new ArrayList<Integer>();
    int primer;

    public PrimerCounter(int primer) {
        this.primer = primer;
    }


    public List<Integer> getFactor() {
        // the type of primer_factors,  I have tried List<int[]> . But in the test case, Arrays.asList returns ArrayList<T>, should be an object. Hence, I change to List<Integer[]>
        primer_factors.add(1);
        if (primer > 1) {
            primer_factors.add(primer);
        }
        return primer_factors;
    }
}

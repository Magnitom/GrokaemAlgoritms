package sum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumTest {

    private final int[] arr = new int[4];

    @Before
    public void initArr(){
        arr[0] = 6;
        arr[1] = 4;
        arr[2] = 9;
        arr[3] = 1;
    }



    @Test
    public void sumShouldTrueSolution(){
        Sum sum = new Sum();
        Assert.assertEquals(20, sum.sumRec(arr));
    }
}

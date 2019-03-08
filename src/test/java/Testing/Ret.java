package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ret {


    @Test(retryAnalyzer = utilities.Retry.class)
    void pub(){
        System.out.println("reterst");
        Assert.assertEquals(false,true);

    }

    @Test
    void pub2(){
        System.out.println("reterst");
        Assert.assertEquals(false,true);

    }


}

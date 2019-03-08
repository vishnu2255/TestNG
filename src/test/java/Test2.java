import org.testng.Assert;
import org.testng.annotations.*;

public class Test2 {

    @Test
    public void test(){
        System.out.println("test ng ");
    }

    @BeforeClass
    public void before(){
        System.out.println("before class");

    }

    @Test
    void test2(){
        System.out.println("test ng2");
    }

    @Test
    void ast3(){
        Assert.assertEquals(1,2);
//        Assert.fail();
    }

    @AfterClass
    public void after(){
        System.out.println("After class");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("before suite");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("After suite");
    }





}


class Test3{

    @Test
    public void test(){
        System.out.println("test 3 class method");
        }



}


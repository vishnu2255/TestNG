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


package Testing;


import org.testng.annotations.Test;

public class Prior {

@Test(priority = 0)
public void test1(){
    System.out.println("test 1");

}

@Test(priority = 1)
    public void test2(){
    System.out.println("test 2");
}

}

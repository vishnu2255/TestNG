import org.testng.annotations.Test;

public class Temp {

    @Test(groups = {"group1"})
    public void test1(){

        System.out.println("test1 ");
    }

    @Test(groups = {"group2"})
    public void test2(){
        System.out.println("test group2");
    }

    @Test(groups = {"group1"})
    public void ast3(){
        System.out.println("test3");
    }


    @Test(dependsOnGroups = {"group1"})
    public void zbtup()
    {
        System.out.println("set up");
    }

    @Test(dependsOnMethods = {"test2"})
    public void login(){
        System.out.println("login depends on test2");
    }



}

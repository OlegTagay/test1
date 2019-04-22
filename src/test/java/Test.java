import org.junit.Assert;
import org.junit.experimental.categories.Category;

public class Test {

    @Category(Regression.class)
    @org.junit.Test
    public void test(){
        System.out.println("test");
        Assert.assertTrue(true);
    }

    @Category(Regression.class)
    @org.junit.Test
    public void test1(){
        System.out.println("test1");
        Assert.assertTrue(true);
    }

    @Category(Performance.class)
    @org.junit.Test
    public void test2(){
        System.out.println("test2");
        Assert.assertTrue(true);
    }

    @Category(Performance.class)
    @org.junit.Test
    public void test3(){
        System.out.println("test3");
        Assert.assertTrue(true);
    }
}

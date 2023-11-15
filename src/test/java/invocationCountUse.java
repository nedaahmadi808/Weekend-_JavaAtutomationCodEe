import org.testng.annotations.Test;

public class invocationCountUse {
@Test(priority=1)
public void sample1 () {
	System.out.println("this is test1");
}
@Test(priority=2)
public void sample2 () {
	System.out.println("this is test2");
}
@Test(priority=3 , invocationCount=5)
public void sample3 () {
	System.out.println("this is test3");
}
}


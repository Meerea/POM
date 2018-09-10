package week_4clswork;

import org.testng.annotations.Test;

public class DependsOn4 {

	@Test(dependsOnMethods= {"week_4clswork.DependsOn4.test3,week_4clswork.DependsOn4.test4"})
	public void test1(){
		System.out.println("this is method no 1");
		
	}
	@Test()
	public void test2()
	{
		System.out.println("this is method no 2");
	}
	@Test()
    public void test3() {
    	System.out.println("this is method no 3");
    }
    @Test()
    public void test4()
    {
    	System.out.println("this is method no 4");
	}

	}



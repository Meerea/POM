package week_4clswork;

import org.testng.annotations.Test;

public class DependsOn5 {

	@Test(dependsOnMethods= {"week_4clswork.DependsOn5.test4"})	
	public void test1() {
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
	@Test(dependsOnMethods= {"week_4clswork.DependsOn5.test1"})
	public void test4()
	{
		System.out.println("this is method no 4");
	}




}



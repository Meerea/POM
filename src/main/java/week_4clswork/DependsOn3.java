package week_4clswork;

import org.testng.annotations.Test;

public class DependsOn3 {

		@Test(dependsOnMethods= {"week_4clswork.DependsOn3.test3"})

		public  void test1() {
			System.out.println("this is method no 1");
			
		}
		@Test()
		public void test2()
		{
			System.out.println("this is method no 2");
		}
		@Test(dependsOnMethods={"week_4clswork.DependsOn3.test4"})
	    public void test3() {
	    	System.out.println("this is method no 3");
	    }
	    @Test()
	    public void test4()
	    {
	    	System.out.println("this is method no 4");
	    }

	}



package week_4clswork;

import org.testng.annotations.Test;

public class DependsOn2 {

	 
	@Test(dependsOnMethods= {"week_4clswork.DependsOn2.test4"})

		public  void test1() {
			System.out.println("this is method no 1");
			
		}
		@Test(dependsOnMethods= {"week_4clswork.DependsOn2.test4"})
		public void test2()
		{
			System.out.println("this is method no 2");
		}
		@Test
	    public void test3() {
	    	System.out.println("tthis is method no 3");
	    }
	    @Test   
	    public void test4()
	    {
	    	System.out.println("this is method no 4");
	    }

	}



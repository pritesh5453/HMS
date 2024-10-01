package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotation {

	@BeforeSuite
	public void test1()
	{
		System.out.println("This is Suite 1'");
	}
	@BeforeTest
	public void test2()
	{
		System.out.println("This is Test 2");
	}
	@BeforeClass
	public void test3()
	{
		System.out.println("This is Class 3");
	}
	@BeforeMethod 
	public void test4()
	{
		System.out.println("This is Method 4");
	}
}


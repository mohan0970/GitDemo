package Automation;

import org.testng.annotations.Test;

public class App {
	@Test
	public void app()
	{
		System.out.println("app1");
		System.out.println("app2");
	}
	
	@Test
	public void app1()
	{
		System.out.println("app3");
		System.out.println("app4");
	}
	
	@Test
	public void app3()
	{
		System.out.println("app5");
		System.out.println("app6");
	}

}

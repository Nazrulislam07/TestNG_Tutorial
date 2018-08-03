package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Parameters({"URL"})
	@Test
	public void webloginCarloan(String urlname)
	{
		System.out.println("WebLogincar");
		System.out.println(urlname);
	}
	
	@Test
	public void mobilelogincarloan()
	{
		System.out.println("mobilelogincarloan");
		
	}

	@Test
	public void mobilesignincarloan()
	{
		System.out.println("mobilesignincarloan");
		
	}

	@Test
	public void mobilesignoutcarloan()
	{
		System.out.println("mobilesignoutcarloan");
		
	}
	@Test(groups={"Smoke"})
	public void LoginAPIcarloan()
	{
		System.out.println("APIcarloan");
	}
}

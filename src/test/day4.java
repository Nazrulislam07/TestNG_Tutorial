package test;

import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void webloginHomeloan()
	{
		System.out.println("WebloginHome");	
	}
	
	@Test(groups={"Smoke"})
	public void mobilelogincarloan()
	{
		System.out.println("MobileloginHomeloan");
		
	}
	
	@Test
	public void LoginAPIcarloan()
	{
		System.out.println("mobileAPIHomeloan");
	}
}

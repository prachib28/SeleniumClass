package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	
	@Test(priority=1)
	
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test(invocationCount=2)
	public void block()
	{
		Reporter.log("block",true);
	}
	
	@Test(priority=-1,enabled=false)
	public void chats()
	{
		Reporter.log("chats",true);
	}
		

}

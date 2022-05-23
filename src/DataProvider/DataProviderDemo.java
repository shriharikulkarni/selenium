package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider (name="testData")
	
	public Object[][] getData1(){
		Object[][] data =new Object [2][2];
		
		data[0][0]="user1";
		data[0][1]="password1";
		
		data[1][0]="user2";
		data[1][1]="password2";
		
		return data;
			
	}

	
	@Test(dataProvider="testData")
	public void login (String username, String password )
	
	{
		System.out.println("username is  : " + username);
		System.out.println("username is  : " + password);
		
//		System.out.println("username is  : " + username);
//		System.out.println("username is  : " + password);
//		
		
	}
}

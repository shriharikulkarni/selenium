package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderNew {
	public WebDriver driver;
	@BeforeMethod
	public void Browserlounch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/jdk and eclips/eclipse/chromedriver/chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	}
	
	@DataProvider(name="testdata")
	
	
		    public Object[][]getdata1(){
			Object[][] data = new  Object[2][2]; 
			
			data [0][0]="9766205248";
			data [0][1]="9561894708";
			
			data [1][0]="1234567890";
			data [1][1]="1234567890";
			
			return data;
			
		}
	@Test(dataProvider="testdata")
	public void login(String username11,String password1) 
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username11);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password1);
		driver.findElement(By.name("login")).click();
		
	}
}

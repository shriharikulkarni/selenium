package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderRealTime {
	
	public WebDriver driver ;
	  
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/jdk and eclips/eclipse/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
			
	}
	@DataProvider(name="testdata")
	public Object [][] getdata1(){
		Object [][] data = new Object[1][2];
		
		data[0][0]="9766205248";
		data[0][1]="9561894708";
		
		return data;
				
	}
	
	@Test(dataProvider="testdata")
	public void login (String username,String password) throws InterruptedException
	
	{
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9766205248");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div")).sendKeys("956184708");
	
	      driver.findElement(By.name("login")).click();
	
	
	
    }
}


     

       










package DemoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginFacebook {

	public static void main(String[] args) throws InterruptedException {
		//Lunch
		System.setProperty("webdriver.chrome.driver","C:/jdk and eclips/eclipse/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		//open google
		driver.get("https://www.google.com/");

		//Navigate to facebook
		driver.navigate().to("https://www.facebook.com/");

		//maximize page
		driver.manage().window().maximize();


		//check username text is present or not
		boolean found=driver.findElement(By.name("email")).isDisplayed();
		if(found) {
			System.out.println("text box is present");
		}else {
			System.out.println("text box is not present");	
		}



		//check password text is present or not
		boolean found1=driver.findElement(By.id("passContainer")).isDisplayed();
		if(found1) {
			System.out.println("text box is present");
		}else {
			System.out.println("text box is not present");	
		}


		//located username text
		driver.findElement(By.name("email")).sendKeys("9766205248");



		//locate password text 
		//driver.findElement(By.id("passContainer")).sendKeys("9561894708");
		//driver.findElement(By.xpath("//div[text,'passContainer']")).sendKeys("9561894708");

		WebDriverWait wait = new  WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("passContainer"))).sendKeys("9561894708");
	}

}

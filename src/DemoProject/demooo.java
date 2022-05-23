package DemoProject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demooo {

	public static void main(String[] args, int i) {
		//Lunch
		System.setProperty("webdriver.chrome.driver","C:/jdk and eclips/eclipse/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		//open google
		driver.get("https://www.google.com/");

		List<WebElement> a= driver.findElements(By.tagName("a"));
		int num = a.size();
		System.out.println(num);
		
		for(i=0,i<=num-1,i++) {
			
			String b=a.get(num).getText();
			System.out.println(b);
			
		}

	}

}

package FunctionOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionOfWebElement01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/jdk and eclips/eclipse/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		String  abc	=driver.findElement(By.className("gb_d")).getText();

		System.out.println(abc);

	}

}

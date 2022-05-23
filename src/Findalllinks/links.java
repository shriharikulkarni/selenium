package Findalllinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/jdk and eclips/eclipse/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		//WebElement a=driver.findElement(By.className("gb_d"));
		
		String a=driver.getTitle();   
		System.out.println(a);
		List <WebElement> web=driver.findElements(By.tagName("a"));
		
		int abcd =web.size();
		
		for(WebElement We :web) {
		 We.click();
		 driver.close();
		 driver.get("https://www.google.co.in/");
		}
			
			
//		boolean b	=driver.getPageSource().contains("gogle");
//		System.out.println(b);
//		if(b) {
//			System.out.println("content available");
//		}else {
//			System.out.println("not content available");
//		}
//		
//		
//		int abc =web.size();
//		for(int i=0;i<abcd;i++) {
//		
//			String aa=web.get(i).
//			System.out.println(b);
//			
		}
		
	}



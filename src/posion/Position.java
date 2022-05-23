package posion;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:/jdk and eclips/eclipse/chromedriver/chromedriver.exe");
		
		
		WebDriver abc = new ChromeDriver();
		
		abc.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		abc.manage().window().maximize();
		
//		Point p = new Point(200,50);
//		abc.manage().window().setPosition(p);
		
		Dimension d =new Dimension(50,100);
		abc.manage().window().setSize(d);
		

	



	}

}

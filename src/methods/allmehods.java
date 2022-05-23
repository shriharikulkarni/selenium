package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allmehods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/jdk and eclips/eclipse/chromedriver/chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		//driver.navigate().to("https://www.google.com/");
		//Thread.sleep(5000);

		//String abc=driver.getCurrentUrl();
		//System.out.println(abc);

		String	abc=driver.getTitle();
		System.out.println(abc);
		
		
		
		
		String b ="Facebook – log in or sign up";
		
		if(abc.equalsIgnoreCase(b)) {
			System.out.println("expt:"+b+ "and act :"+abc+"same");
		}else {
			System.out.println("expt and act not same");
		}



		//        driver.findElement(By.id("email")).sendKeys("9766205248");
		//     
		//        driver.findElement(By.name("pass")).sendKeys("9561894708");
		//        
		//        driver.findElement(By.name("login")).click();
		//        
		//        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]")).click();
		//        

	}

}

package ChangePositionOfbrowser;


import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ChangePositionOfbrowser01 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:/jdk and eclips/eclipse/chromedriver/chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 
		  File finaldestination =new File( "C:\\Users\\hp\\eclipse-workspace\\seleniumdemo\\screensot");
		  FileHandler.copy(scrFile, finaldestination);
		 
driver.close();


	}

}

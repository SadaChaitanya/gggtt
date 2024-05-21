package pract;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class general {
	
	
	
	@Test
	public void get()
	
	{
 System.out.println("selenium java");
}
	
	@Test
	public void page()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");	
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kratosolutions.com/");
		driver.close();
	}
	
	@Test
	public void scrnshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");	
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kratosolutions.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trt=new File(".//sreenshot//homepage.png");
		FileUtils.copyFile(src, trt);
		
	}
}
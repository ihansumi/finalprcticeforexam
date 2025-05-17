package org.ictkerala.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class InitiaSetupAmazon {
	
	public WebDriver driver;
	Properties prop;
	
	public void propload() throws IOException {
		FileInputStream propobj=new FileInputStream("src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(propobj);		
	}
	
	@BeforeTest
	
	public void initialSettings() throws IOException {
		
		propload();
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();			
		}
		else{
			System.out.println("Invalid broser url is entered");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}

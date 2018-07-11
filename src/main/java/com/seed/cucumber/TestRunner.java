package com.seed.cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public abstract class TestRunner {

	public static WebDriver webDriver;

	public TestRunner(){
		initializeWebdriver();
	}

	public static String baseUrl = "https://www.google.com/";

	protected static void initializeWebdriver(){
		if(System.getProperty("os.name").contains("Windows")) {
			if(System.getProperty("webdriver.chrome.driver") == null) {
				System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
			}
		}
		webDriver = new ChromeDriver();
//		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeClass
	public static void setUpSuite(){
		if ( webDriver == null ){
			initializeWebdriver();
		}
	}

	@AfterClass
	public static void tearDownSuite(){
		webDriver.quit();
		webDriver = null;
	}

	public static String getBaseUrl() {
		return baseUrl;
	}

}

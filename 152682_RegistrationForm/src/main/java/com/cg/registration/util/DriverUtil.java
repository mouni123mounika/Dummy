package com.cg.registration.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

	WebDriver driver;

	public WebDriver DriverUtil(String name) {

		if (name.equals("chrome")) {
			// Here browser will be set
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			// Here browser will be maximized
			driver.manage().window().maximize();
			return driver;

		} else if (name.equals("firefox")) {
			// Here browser will be set
			System.setProperty("webdriver.firefox.driver", "Drivers\\firefox.exe");
			driver = new FirefoxDriver();
			// Here browser will be maximized
			driver.manage().window().maximize();
			return driver;

		} else {
			// Here browser will be set
			System.setProperty("webdriver.InternetExplorer.driver", "Drivers\\InternetExplorer.exe");
			driver = new ChromeDriver();
			// Here browser will be maximized
			driver.manage().window().maximize();
			return driver;
		}

	}

	public void close() {
		driver.quit();
	}
}

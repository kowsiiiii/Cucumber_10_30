package com.adactin.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver; // Null

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\chrome\\chromedriver_win32 (7)\\chromedriver.exe");

			driver = new ChromeDriver(); // upCasting

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\chrome\\chromedriver_win32 (7)\\geckodriver.exe");

			driver = new FirefoxDriver(); // upCasting

		}

		driver.manage().window().maximize();

		return driver;

	}

	public static WebDriver getUrl(String url) {

		driver.get(url);

		return driver;

	}

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static WebDriver close() {

		driver.close();

		return driver;
	}

	public static WebDriver quit() {

		driver.quit();

		return driver;
	}

	public static void dropDown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("selectByValue")) {

			s.selectByValue(value);

		}

		else if (type.equalsIgnoreCase("selectByIndex")) {

			int data = Integer.parseInt(value);

			s.selectByIndex(data);

		}

		else if (type.equalsIgnoreCase("selectByvisibleText")) {

			s.selectByVisibleText(value);

		}

	}

}

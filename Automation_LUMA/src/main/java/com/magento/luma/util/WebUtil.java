package com.magento.luma.util;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;
import lombok.Getter;

@Getter
public class WebUtil {

	private  WebDriver driver; /// null

//	public WebDriver getDriver() {
//		return driver;
//	}
	///  SingleTon Design Pattern
	
	///  generic methods , web utility methods  -   application independent methods
	///  wrapper methods  -   
	
	private WebUtil() {
		
	}
	private static WebUtil wu;  ///   null
	
	public static WebUtil getInstance() {
		if(wu==null) {
			wu=new WebUtil();
		}
		 
		return wu;
	}
	
	
	public  void launchBrowserAndOpenLoginPage() {
		
		launchBrowser();
		openUrl("http://localhost:8888/");
	}
	
	public  void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println("Chrome Browser launched successfully");
	
	}

	public  void openUrl(String url) {
		try {
			driver.get(url);
		} catch (NullPointerException e) {
			System.out.println("Our driver is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hit the URL successfully");
	}
	
	
	public void close() {
		try {
		driver.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public  void mySendKeys(String inputValue, WebElement we) {
		String elementName=we.getAccessibleName();
	
		/*
		WebElement weObj=null;
		 weObj=driver.findElement(By.xpath("//input[@name='user_name']"));
		weObj.clear();
		weObj.getTagName();
		
		weObj.sendKeys("admin");
//		
		*/
		
		
		try {
			we.clear();
			we.sendKeys(inputValue);
			System.out.println(inputValue + " value entered in " + elementName + "Element");

		} catch (StaleElementReferenceException e) {
			
			we.sendKeys(inputValue);
			System.out.println(inputValue + " value entered in " + elementName + " Element");

		} catch (ElementNotInteractableException e) {
			JavascriptExecutor jss = (JavascriptExecutor) driver;
			jss.executeScript("arguments[0].value='" + inputValue + "'", we);
			System.out.println(inputValue + " value entered in " + elementName + " Element");

		}catch (Exception e) {
			e.printStackTrace();
		}
}
	
	public  void click(WebElement we) {
        String elementName=we.getAccessibleName();
		
		try {
			we.click();
			System.out.println("Clicked on " + elementName + " Button Succesfully");

		} catch (StaleElementReferenceException e) {
			we.click();
			System.out.println("Clicked on " + elementName + " Button Succesfully");

		} catch (ElementClickInterceptedException e) {
			JavascriptExecutor jss = (JavascriptExecutor) driver;
			jss.executeScript("arguments[0].click()'", we);
			System.out.println("Clicked on " + elementName + " Button Succesfully");

		} catch (ElementNotInteractableException e) {

			JavascriptExecutor jss = (JavascriptExecutor) driver;
			jss.executeScript("arguments[0].click()'", we);
			System.out.println("Clicked on " + elementName + " Button Succesfully");
			System.out.println("Clicked on " + elementName + " Button Succesfully");

		} catch (Exception e) {
			System.out.println("Unable to Click on " + elementName + " Button ");
			e.printStackTrace();
		}
	}
	
	public void verifyText(String actual , String expect) {
		if (actual.equalsIgnoreCase(expect)) {
			System.out.println("Text is Matched");
		} else {
			System.out.println("Text is not Matched");
		}
	}
	
	public String mygetText(WebElement we ) {
		return we.getText();
	}
}

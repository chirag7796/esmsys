package Jahernotice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.Test;
import java.util.*;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;
import org.seleniumhq.jetty9.util.log.Log;
import java.text.ParseException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class NewSignUp {
	WebDriver driver;
	
	public void Newuser() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		    driver.get("http://qa.jahernotice.com/"); 
		  //signin
			   driver.findElement(By.xpath("//*[@id=\"linkLoginPopup\"]")).click();
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("/html/body/div[4]/div[2]/ul/li[4]/div[1]/div/div/div[2]/a[2]/b")).click();
			   Thread.sleep(3000);
			   
			   
	           //form signup
			   WebElement fname = driver.findElement(By.id("txtFirstName"));
			   fname.sendKeys("rakesh");
			   
			   Thread.sleep(2000);
			   WebElement lname = driver.findElement(By.id("txtLastName"));
			   lname.sendKeys("patel");
			   Thread.sleep(2000);
			   
			   WebElement mobileno = driver.findElement(By.id("txtPhoneNo"));
			   mobileno.sendKeys("1204113326");
			   Thread.sleep(2000);
			   WebElement emailid = driver.findElement(By.id("txtEmailID"));
			   emailid.sendKeys("hriheshbhish81110991@yopmail.com");
			   emailid.sendKeys(Keys.ENTER);
			   Thread.sleep(2000);
			   
		    ((JavascriptExecutor)driver).executeScript("window.open()");
		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    driver.get("http://www.yopmail.com/en/");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
			   
		    
			   
			   WebElement login = driver.findElement(By.id("login"));
			   login.sendKeys("hriheshbhish81110991");
			   login.sendKeys(Keys.ENTER);
			   
			   Thread.sleep(4000);
			   
			   driver.navigate().refresh();
			   Thread.sleep(4000);
			   
			   driver.navigate().refresh();
			   Thread.sleep(10000);
			   
			   
			   driver.switchTo().window(tabs.get(1)).close();
			
			
		    Thread.sleep(5000);
		    driver.switchTo().window(tabs.get(0));
		    
		    Thread.sleep(4000);
		    WebElement verificationcode = driver.findElement(By.id("btnSubmitActivationCode"));
		    verificationcode.click();
		    Thread.sleep(4000);
		    WebElement profileSelect = driver.findElement(By.xpath("//*[@id=\"btnProfile_1\"]"));
		    profileSelect.click();
		    Thread.sleep(3000);
		    WebElement mainsite = driver.findElement(By.xpath("//*[@id=\"linkToMainSite\"]"));
		    mainsite.click();
		    
		    
			  
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		NewSignUp obj = new NewSignUp();
		
		obj.Newuser();
		
		
	}

}

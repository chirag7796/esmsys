package esmsysCOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
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
import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.Test;
import java.util.*;
import java.io.File;
import java.net.URL;
import java.util.List;
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
import java.util.List;
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
import org.openqa.selenium.Point;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.Point;
import java.awt.event.KeyEvent;
public class billingFullAutomation {
	
	public static void main(String[] args) throws Exception {
		
		  
		 for(int i=0;i<15;i++){   
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options); 
		driver.get("http://qa.billing.easyime.org/");
	    driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement uname = driver.findElement(By.xpath("//*[@id=\"txtuser\"]"));
		 uname.sendKeys("esm.qa");
		 Thread.sleep(2000);

		 WebElement password = driver.findElement(By.xpath("//*[@id=\"txtpassword\"]"));
		 password.sendKeys("esmsys@123");
		 password.sendKeys(Keys.ENTER);
		 Thread.sleep(6000);
		 
		 WebElement status = driver.findElement(By.xpath("//*[@id=\"drpStatus\"]"));
		 status.click();
		 status.sendKeys(Keys.DOWN);
		 Thread.sleep(2000);
		 status.sendKeys(Keys.ENTER);
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[3]/span/a")).click();
		 Thread.sleep(4000);
		 
		 WebElement cash = driver.findElement(By.xpath("//*[@id=\"drpPaymentMode\"]"));
		 cash.click();
		 cash.sendKeys(Keys.DOWN);
		 Thread.sleep(2000);
		 cash.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 
		 
		 WebElement transaction = driver.findElement(By.xpath("//*[@id=\"txtAccountNum\"]"));
		 transaction.sendKeys("148569999");
		 Thread.sleep(3000);
		 
		 WebElement submit = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
		 submit.click();
		 
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 
	}
	
	}

}

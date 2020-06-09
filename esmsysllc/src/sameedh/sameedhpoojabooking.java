package sameedh;
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
public class sameedhpoojabooking {
     
	WebDriver driver;
	
	public void poojabook() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		  
		   
			   driver.get("http://dev.sameedh.com/");
			   Thread.sleep(3000);
			   TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("C:\\Users\\Admin\\Documents\\Zoom\\Home.jpg"));
			   WebElement ok = driver.findElement(By.xpath("//*[@id=\"btndivCookiesOK\"]"));
			   ok.click();
			   Thread.sleep(3000);
			   
			   WebElement sign = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/div[2]/ul/li/div/small/a"));
			   sign.click();
			
			   Thread.sleep(5000);
			   
			   WebElement uname = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
			   uname.sendKeys("rajushah");
			   uname.sendKeys(Keys.ENTER);
			   
			   Thread.sleep(5000);
			   
			   WebElement pass = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
			   pass.sendKeys("Raju@1234");
			   pass.sendKeys(Keys.ENTER);
			   
			   Thread.sleep(7000);
			   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        
		       FileUtils.copyFile(scrFile, new File("C:\\Users\\Admin\\Documents\\Zoom\\Login.jpg"));
		       
			   //Pooja
			   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/div[1]/ul/li[1]/a/span")).click();
			   
			   
			   Thread.sleep(5000);
			   //simant sanskar
			   driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div/div/div[2]/div/div")).click();
			   Thread.sleep(5000);
			   
			   //request for servise
			   driver.findElement(By.xpath("//*[@id=\"DivRequestforService\"]")).click();
			   
			   Thread.sleep(5000);
			   TakesScreenshot ts3 = (TakesScreenshot)driver;
				File source2 = ts3.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source2, new File("C:\\Users\\Admin\\Documents\\Zoom\\Requestpooja.jpg"));
				
				Thread.sleep(3000);
			   WebElement date = driver.findElement(By.xpath("//*[@id=\"span\"]"));
			   date.click();
			   Thread.sleep(5000);
			   
			   WebElement set = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[3]/div/div/div/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/a[1]"));
			   set.click();
			   
			   Thread.sleep(5000);
			   
			   Select location = new Select(driver.findElement(By.id("ddlPoojaLocation")));
		        location.selectByIndex(1);
			   
		        Thread.sleep(5000);
		        //priest search button
		        driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
		        
		        Thread.sleep(5000);
		        TakesScreenshot ts4 = (TakesScreenshot)driver;
				File source3 = ts4.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source3, new File("C:\\Users\\Admin\\Documents\\Zoom\\PriestFound.jpg"));
			
				
		    
		        
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("//*[@id=\"btn_a000602c-e18d-4429-a4e5-d38909d13577\"]")).click();
		        Thread.sleep(3000);
		        WebElement note = driver.findElement(By.id("comment"));
		        note.sendKeys("Hi");
		        note.sendKeys(Keys.ENTER);
		        
		        Thread.sleep(5000);
		        TakesScreenshot ts5 = (TakesScreenshot)driver;
				File source4 = ts5.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source4, new File("C:\\Users\\Admin\\Documents\\Zoom\\RequestPlaced.jpg"));
		        
	}
	
	public void closebrowser() {
		driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		sameedhpoojabooking obj = new sameedhpoojabooking();
		obj.poojabook();
		obj.closebrowser();
		
	}
}

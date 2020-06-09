package Jahernotice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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




public class LandRecordAutomation {
WebDriver driver;
	
	public static String generateRandomName(int length) {
	    char[] chars ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
	            .toCharArray();
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        char c = chars[random.nextInt(chars.length)];
	        sb.append(c);
	    }
	    String randomString = sb.toString();
	    return randomString;
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		 for(int i=0;i<5;i++){
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options); 
		   driver.get("http://qa.jahernotice.com/");
		   driver.manage().window().maximize();

			   Thread.sleep(3000);
			  
			   //LR
			   driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[3]/a")).click();
			   Thread.sleep(3000);
			   
			   JavascriptExecutor jse = (JavascriptExecutor)driver;
			   jse.executeScript("window.scrollBy(0,1000)");
			   //radio
			   driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/label")).click();
			   Thread.sleep(3000);
			   //nextButton
			   driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div/div[1]/div[2]/div[2]/button")).click();
			   Thread.sleep(3000);
			 //select type
			   driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/a/span[1]")).click();
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/a/ul/li[1]")).click();
			   Thread.sleep(3000);
			  //next
			   driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div/div[2]/div/div[3]/button")).click();
			   Thread.sleep(3000);
			   //pincode
			   WebElement pincode = driver.findElement(By.xpath("//*[@id=\"txtVillage\"]"));
			   pincode.sendKeys("362620");
			   Thread.sleep(3000);
			   pincode.sendKeys(Keys.DOWN);
			   Thread.sleep(3000);
			   pincode.sendKeys(Keys.ENTER);
			   Thread.sleep(3000);
			   
			   WebElement surveynumber = driver.findElement(By.xpath("//*[@id=\"txtSurveyNo\"]"));
			   surveynumber.sendKeys("2566");
			   surveynumber.sendKeys(Keys.ENTER);
			   
			   Thread.sleep(3000);

	           //form signup
			   WebElement fname = driver.findElement(By.id("txtFirstName"));
			   fname.sendKeys("chirag");
			   
			   Thread.sleep(2000);
			   WebElement lname = driver.findElement(By.id("txtLastName"));
			   lname.sendKeys("patel");
			   Thread.sleep(2000);

			   Thread.sleep(2000);
			   String phone = "6356" + new Random().nextInt(1000) + "785" ;
			   driver.findElement(By.id("txtPhoneNo")).sendKeys(phone);
	
			   Thread.sleep(3000);
		
			   String emailid = "rahuls" + new Random().nextInt(500) + "@yopmail.com";
			   driver.findElement(By.id("txtEmailID")).sendKeys(emailid);
			  
			   Thread.sleep(5000);
			   driver.findElement(By.id("txtEmailID")).sendKeys(Keys.ENTER);
				  
			   Thread.sleep(3000);
			   
			   
		   } 
			  
	}
	
	

}

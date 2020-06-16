package esmsysCOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

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
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.seleniumhq.jetty9.util.log.Log;
import java.text.ParseException;
import java.util.List;
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


public class NewApplicantAppointment {
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
	public static void main(String[] args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		  
		   for(int i=0;i<2;i++){
			   driver.get("http://qa.easyime.org/");
			   Thread.sleep(3000);
			   
			   WebElement Zipcode = driver.findElement(By.xpath("//*[@id=\"txtZipCode\"]"));
			   Zipcode.sendKeys("10001");
			   Zipcode.sendKeys(Keys.ENTER);
			   
			   Thread.sleep(10000);
			   //schedule a appointment
			   driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div[5]/div/form/button")).click();
			   Thread.sleep(3000);
			   //date
			   driver.findElement(By.xpath("//*[@id=\"7061_1\"]")).click();
			   Thread.sleep(3000);
			  //Time
			   driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div[6]/form/div/div/div[1]/div[2]/div[2]/div[2]/button[3]")).click();
			   Thread.sleep(3000);
			   //Continue
			   driver.findElement(By.xpath("//*[@id=\"BtnEnable_7061\"]")).click();
			   Thread.sleep(3000);
			   
			   String firstName = NewApplicantAppointment.generateRandomName(9); // 9 Characters long
			   driver.findElement(By.id("txtFirstName")).sendKeys(firstName);
			   
			   //WebElement fname = driver.findElement(By.id("txtFirstName"));
			   //fname.sendKeys("chirag");
			   Thread.sleep(1000);
			   WebElement lname = driver.findElement(By.id("txtLastName"));
			   lname.sendKeys("solanki");
			   Thread.sleep(1000);
			   
			   String emailid = "chirag" + new Random().nextInt(1000) + "@yopmail.com" ;
			   driver.findElement(By.id("txtEmailId")).sendKeys(emailid);
			   //WebElement email = driver.findElement(By.id("txtEmailId"));
			   //email.sendKeys("solanki@yopmail.com");
			   
			   Thread.sleep(1000);
			  			   
			   WebElement mobileNo = driver.findElement(By.id("txtPrimaryPhone"));
			   JavascriptExecutor js = (JavascriptExecutor)driver;
			    js.executeScript("document.getElementById('txtPrimaryPhone').value='9737478239'");
			    js.executeScript("arguments[0].click();", mobileNo);
			   
			    Thread.sleep(1000);
			    //DOB
			    WebElement MM = driver.findElement(By.id("txtMM_1"));
			    MM.sendKeys("07");
			    Thread.sleep(1000);
			    WebElement DD = driver.findElement(By.id("txtDD_1"));
			    DD.sendKeys("07");
			    Thread.sleep(1000);
			    WebElement YYYY = driver.findElement(By.id("txtYY_1"));
			    YYYY.sendKeys("1996");
			    Thread.sleep(1000);
	            //male/female
			    driver.findElement(By.id("chkMale")).click();
			    
			    
			    TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("C:\\Users\\Admin\\Documents\\Zoom\\form.jpg"));
			    Thread.sleep(5000);
			    
			    //request button
			    driver.findElement(By.xpath("/html/body/form/div[2]/div/div/div[4]/div[9]/button")).click();
			    Thread.sleep(5000);
			    TakesScreenshot ts3 = (TakesScreenshot)driver;
				File source2 = ts3.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source2, new File("C:\\Users\\Admin\\Documents\\Zoom\\Appointmentplaced.jpg"));
	
				//i-693 click
				driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/ul/li[2]/a")).click();
				Thread.sleep(3000);
				
				WebElement city = driver.findElement(By.id("txtBirthPlace"));
				city.sendKeys("austin");
			    Thread.sleep(1000);

			    WebElement state = driver.findElement(By.id("txtBirthCountry"));
			    state.sendKeys("Texas USA");
			    Thread.sleep(1000);

			    WebElement streetaddress = driver.findElement(By.id("txtStreet1"));
			    streetaddress.sendKeys("17,goldfitch avenue austin texas USA");
			    Thread.sleep(1000);
 
			    
			    driver.findElement(By.xpath("//*[@id=\"rdbSte\"]")).click();
			    Thread.sleep(1000);

			    
			    WebElement No = driver.findElement(By.id("txtAptSteFlrNo"));
			    No.sendKeys("17");
			    Thread.sleep(1000);
			    
			    
			    TakesScreenshot ts4 = (TakesScreenshot)driver;
				File source3 = ts3.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source3, new File("C:\\Users\\Admin\\Documents\\Zoom\\I693 done.jpg"));
				Thread.sleep(3000);
				
				//submit
			    driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div/div[3]/div/button")).click();
			    Thread.sleep(4000);
				
			    TakesScreenshot ts5 = (TakesScreenshot)driver;
				File source4 = ts5.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source4, new File("C:\\Users\\Admin\\Documents\\Zoom\\I693 thank you.jpg"));
				Thread.sleep(3000);
				
				

	}
	}
}

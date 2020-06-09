package esmsysCOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
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
public class CSsignUp {
	
	public void signup() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://qa.cs.easyime.org/CSSignUp/MemberShipForm");
		   WebElement practice = driver.findElement(By.id("txtPracticeName"));
		   practice.sendKeys("chirag newyork hospital");
		   practice.sendKeys(Keys.TAB);
		   Thread.sleep(3000);
		   
		   WebElement fname = driver.findElement(By.id("txtFirstName"));
		   fname.sendKeys("rahul");
		   fname.sendKeys(Keys.TAB);
		   Thread.sleep(3000);
		   WebElement mname = driver.findElement(By.id("txtMiddleName"));
		   mname.sendKeys("s");
		   mname.sendKeys(Keys.TAB);
		   Thread.sleep(3000);
		   WebElement lname = driver.findElement(By.id("txtLastName"));
		   lname.sendKeys("patel");
		   lname.sendKeys(Keys.TAB);
		   Thread.sleep(3000);
		   
		  
		   WebElement addreess = driver.findElement(By.id("txtStreetNoName"));
		   addreess.sendKeys("Newark International Airport Street");
		   
		   Thread.sleep(3000);
		 
		   addreess.sendKeys(Keys.DOWN);
		   
		   Thread.sleep(3000);
		   
		   addreess.sendKeys(Keys.ENTER);
		   
		   Thread.sleep(5000);
		   
		   
		   WebElement nextBtn = driver.findElement(By.id("txtPrimaryContactNo"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    //code to enter value in the email textbox
		    js.executeScript("document.getElementById('txtPrimaryContactNo').value='9738478588'");
		    //code to click on next button
		    js.executeScript("arguments[0].click();", nextBtn);
		   
		    Thread.sleep(5000);
		    
		    WebElement email = driver.findElement(By.id("txtPrimaryEmail"));
		    email.sendKeys("chirag7796@yopmail.com");
		    
		    Thread.sleep(5000);
		   
		    
		    
		    
		    WebElement emailcheck = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div[2]/div[3]/div[1]/div/div[2]/h5[1]/label"));
		    emailcheck.click();
		    Thread.sleep(5000);
		    TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\Users\\Admin\\Documents\\Zoom\\1-page.jpg"));
			Thread.sleep(5000);
		    WebElement nextbutton = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div[2]/div[3]/div[2]/div/button[2]/span"));
		  
		    nextbutton.click();
		    
		    Thread.sleep(10000);
		    
		    WebElement adultfees = driver.findElement(By.id("txtAdultFees"));
		    adultfees.sendKeys("300");
		    
		    Thread.sleep(5000);
		    
		    WebElement childfees = driver.findElement(By.id("txtChildFees"));
		    childfees.sendKeys("150");
		    
		    Thread.sleep(5000);
		    
		    WebElement cash = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div[2]/div[2]/div[1]/div/h5[1]/label"));
		    cash.click();
		    
		    Thread.sleep(5000);
		    
		    WebElement cheque = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div[2]/div[2]/div[1]/div/h5[2]/label"));
		    cheque.click();
		    
		    Thread.sleep(5000);
		    
		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile, new File("C:\\Users\\Admin\\Documents\\Zoom\\2-page.jpg"));
		    Thread.sleep(5000);
		    
		    WebElement next2 = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div[2]/div[2]/div[2]/div/button[2]/span"));
		    next2.click();
		    
		    Thread.sleep(10000);
		    

		    WebElement selectpackage = driver.findElement(By.xpath("//*[@id=\"btnEssential_0\"]"));
		    selectpackage.click();
		    
		    Thread.sleep(10000);
		    
		    WebElement next3 = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
		    next3.click();
		    Thread.sleep(5000);
		    
		    TakesScreenshot ts3 = (TakesScreenshot)driver;
			File source2 = ts3.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source2, new File("C:\\Users\\Admin\\Documents\\Zoom\\3-page.jpg"));
			
		    Thread.sleep(10000);		    
		    
		    WebElement monday = driver.findElement(By.id("From_0"));
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		    js.executeScript("document.getElementById('From_0').value='10:00'");
		    js.executeScript("arguments[0].click();", monday);
		    
		    Thread.sleep(6000);
		    
		    WebElement monday2 = driver.findElement(By.id("To_0"));
		    JavascriptExecutor jser = (JavascriptExecutor)driver;
		    js.executeScript("document.getElementById('To_0').value='15:00'");
		    js.executeScript("arguments[0].click();", monday2);
		   
		    Thread.sleep(6000);
		    
		    WebElement next4 = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
		    next4.click();
		    
		    Thread.sleep(10000);
		  
		    TakesScreenshot ts4 = (TakesScreenshot)driver;
			File source3 = ts4.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source3, new File("C:\\Users\\Admin\\Documents\\Zoom\\4-page.jpg"));
		
			Thread.sleep(6000);
			
		    WebElement next5 = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
		    next5.click();
		   
		    Thread.sleep(10000);
		    
		    WebElement accept = driver.findElement(By.id("activeCard"));
		    accept.click();
		    
		    Thread.sleep(6000);
		    
		    TakesScreenshot ts5 = (TakesScreenshot)driver;
			File source4 = ts5.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source4, new File("C:\\Users\\Admin\\Documents\\Zoom\\5-page.jpg"));
	        
		    WebElement nextsubmit5 = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div[2]/div/div[7]/div/button[2]/span"));
		    nextsubmit5.click();
		    Thread.sleep(6000);
		    
		    TakesScreenshot ts6 = (TakesScreenshot)driver;
			File source5 = ts6.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source5, new File("C:\\Users\\Admin\\Documents\\Zoom\\doctorplacedThankyouPage.jpg"));
		
	}

	public void COMredirect() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://qa.easyime.org/lawyer/addeditsignupform");
	
		   Thread.sleep(3000);
			 //Lawyer form
		   driver.findElement(By.xpath("/html/body/form/div[2]/div/div/div[2]/div/div[2]/div[1]/label[1]")).click();
		   Thread.sleep(3000);
		   
		   WebElement fname = driver.findElement(By.id("txtFirstName"));
		   fname.sendKeys("chirag");
		   fname.sendKeys(Keys.TAB);
		   Thread.sleep(3000);
		   WebElement mname = driver.findElement(By.id("txtMiddleName"));
		   mname.sendKeys("s");
		   mname.sendKeys(Keys.TAB);
		   Thread.sleep(3000);
		   WebElement lname = driver.findElement(By.id("txtLastName"));
		   lname.sendKeys("patel");
		   Thread.sleep(3000);
		   WebElement practice = driver.findElement(By.id("txtLegalPracticeName"));
		   practice.sendKeys("chirag Associate");
		   Thread.sleep(3000);
		   
		   WebElement addreess = driver.findElement(By.id("txtStreetNumberName"));
		   addreess.sendKeys("Newark International Airport Street");
		   Thread.sleep(3000);
		    
		   WebElement city = driver.findElement(By.id("txtCity"));
		   city.sendKeys("neva"); 
		   Thread.sleep(3000);
		   
		   WebElement state = driver.findElement(By.id("txtState"));
		   state.sendKeys("NY"); 
		   Thread.sleep(3000);
		   
		   WebElement Zip = driver.findElement(By.id("txtZip"));
		   Zip.sendKeys("10001"); 
		   Thread.sleep(3000);
		   
		   WebElement primarynumber = driver.findElement(By.id("txtPrimaryContactPhone"));
		   primarynumber.sendKeys("9737478898"); 
		   Thread.sleep(3000);
		   
		   WebElement primaryemail = driver.findElement(By.id("txtEmailID"));
		   primaryemail.sendKeys("chirag7796@yopmail.com"); 
		   Thread.sleep(3000);
		   
		   WebElement Fax = driver.findElement(By.id("txtFax"));
		   Fax.sendKeys("8797879797"); 
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("/html/body/form/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[14]/div[3]/div[1]/div/label")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/form/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[14]/div[3]/div[2]/div/label")).click();
		   Thread.sleep(3000);
		   
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy(0,250)");
		   
		  //dropdown
		   WebElement servise = driver.findElement(By.id("ServiceList"));
		   servise.click(); 
		   Thread.sleep(3000);
		   
		   servise.sendKeys(Keys.TAB);
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("/html/body/form/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[15]/div[1]/div[1]/div/div/div/div/label[1]")).click();
		   
		   Thread.sleep(3000);
		   
		   
		  
		   driver.findElement(By.xpath("/html/body/form/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[15]/div[2]/div[1]/label")).click();
		   Thread.sleep(3000);
		   
		   TakesScreenshot ts5 = (TakesScreenshot)driver;
			File source4 = ts5.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source4, new File("C:\\Users\\Admin\\Documents\\Zoom\\Lawyerformdone.jpg"));
	        
			 Thread.sleep(3000);
		   WebElement submit = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
		   submit.click();
		   
		   TakesScreenshot ts6 = (TakesScreenshot)driver;
			File source6 = ts6.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source6, new File("C:\\Users\\Admin\\Documents\\Zoom\\lawyerplacedThankYouPage.jpg"));
	        
		   
		   
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		CSsignUp obj = new CSsignUp();
		
		
		obj.COMredirect();
		obj.signup();
	}
	
}

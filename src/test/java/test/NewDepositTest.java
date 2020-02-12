package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewDepositTest {
	
	   WebDriver driver;
	   
	   @BeforeMethod
	  public void LaunchBrowser() {
		   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		   driver= new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.get("http://techfios.com/test/billing/?ng=admin/");
	   }  
		@Test   
	  public void usershouldBeableToAddDeposit() throws InterruptedException {
			
			    driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
 	            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
		       driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		}
		  
		  
		  
		  
		@Test   
		  public void usershouldBeableToAddDeposit2() throws InterruptedException {
				
				    driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
	 	            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
			       driver.findElement(By.xpath("//button[@type='submit']")).click();
			  
		}
	  
	   
	   
	   
	   
	   
	  @AfterMethod
	  
	  public void closeEverything() {
		  driver.close();
		  driver.quit();
		  
		  
	  }
	  		   
		 
		   
	

   
}
package test.test;
import test.test.WebDriverExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

	public class AppTest  {
		@Test
	   public void test1()
	   {
	    	System.setProperty("webdriver.gecko.driver", "C:\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");        
	    	WebDriver driver = new FirefoxDriver();
			Assert.assertEquals(WebDriverExample.getnumber(driver,"selenium"),1);
			driver.quit();
	   }
		@Test
		   public void test2()
		   {
		    	System.setProperty("webdriver.gecko.driver", "C:\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");        
		    	WebDriver driver = new FirefoxDriver();
				Assert.assertEquals(WebDriverExample.getnumber(driver,"лораплоывроалсоып"),0);
				driver.quit();
		   }
	}

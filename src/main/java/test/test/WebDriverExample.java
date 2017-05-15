package test.test;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverExample  {
    public static int getnumber(WebDriver driver,final String str) {

        driver.get("http://www.yandex.ru");

        WebElement element = driver.findElement(By.id("text"));
        element.sendKeys(str);
        element.submit();
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith(str);
            }
        });
        String results=driver.getTitle();
        String number = new String();
        int i=results.length()-1;
        while(!(Character.isWhitespace(results.charAt(i))))
        {
        	System.out.println(results.charAt(i));
        	i--;
        }
        number=results.substring(i+1, results.length());
        System.out.println(results);  
        System.out.println(number);
        if(number=="найдено")
        	return 0;
        else
        {
        	if(number.contains("млн"))
        		return 1;
        	else
        		{if(!number.contains("тыс"))
        			return 0;
        		else
        			{
        			if(number.charAt(0)>1)
        				return 1;
        			else
        				{if((number.charAt(1)>0)&&(number.charAt(1)<9))
        					return 1;
        				else return 0;
        				}
        			}
        		}
        }
        
        
    }
    public void main(String[] args)
    {
    	System.setProperty("webdriver.gecko.driver", "C:\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");        
    	WebDriver driver = new FirefoxDriver();
    	getnumber(driver,"selenium");
    	driver.quit();
    }
}
package qaclickacedemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SleniumTest {
   @Test
   public void BrowserAutomation()
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello World");
	   System.out.println("BrowserAutomation");
	   System.out.println("Web Automation");
   } 
   @Test
   public void ElementsUi()
   {
	   System.out.println("ElementsUi");
   }
   @Test
   public void ElementsU12i()
   {
	   System.out.println("ElementsUi12");
   }
}

package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAndQuitDemo4 
{
	@Test

	public void closeAndQuit() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
        driver.manage().window().maximize();
        WebElement learnMoreLink = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[2]/div/div[1]/span/div/div/a"));
        learnMoreLink.click();
        
        Thread.sleep(5000);
        driver.close();
        
        
 	}
}
	 
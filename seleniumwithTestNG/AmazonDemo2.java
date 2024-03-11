package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonDemo2 
{
	@Test
	public void Amazon()
	{
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();


		WebElement countryFlag = driver.findElement(By.xpath("//*[@id='icp-nav-flyout']/span/span[2]/span[2]"));
		countryFlag.click();
		Actions act = new Actions(driver);
		act.moveToElement(countryFlag);
		System.out.println("Done");

	}

}

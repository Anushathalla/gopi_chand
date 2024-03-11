package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon 
{
	@Test
	public void Amazon()
	{
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		driver.manage().window().maximize();
		WebElement mobile =driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]"));
		mobile.click();

		Actions act = new Actions(driver);
		act.moveToElement(mobile);
		System.out.println("Done"); 

	}
}
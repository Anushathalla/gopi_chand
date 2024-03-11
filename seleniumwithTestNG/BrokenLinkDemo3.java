package seleniumwithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class BrokenLinkDemo3 
{
	@Test
	public void brokenLink()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/BrokenLink1.html");
		driver.manage().window().maximize();

		WebElement brokenLink = driver.findElement(By.tagName("a"));
		String linkValue = brokenLink.getAttribute("href");
		System.out.println("linkValue:"+linkValue);	
		Assert.assertNotEquals("linkvalue","link is broken");
		System.out.println("Done");


	}

}

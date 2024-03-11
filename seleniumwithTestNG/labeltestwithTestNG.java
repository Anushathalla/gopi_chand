package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class labeltestwithTestNG
{
	@Test
	public void labelverification()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();

		WebElement label = driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		String excpetedData = "to continue to Gmail";
		String aceptedData = label.getText();

		Assert.assertEquals(excpetedData, aceptedData);

	}
}



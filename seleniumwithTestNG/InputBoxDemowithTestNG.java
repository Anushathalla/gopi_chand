package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InputBoxDemowithTestNG 
{

	@Test
	public void inputboxverfication()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();

		WebElement inputbox = driver.findElement(By.xpath("//input[@id='identifiers']"));

		boolean expectedDisplay = true;
		boolean actualDisplay = inputbox.isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		Assert.assertEquals(expectedDisplay, actualDisplay);

		boolean expectedEnabled = true;
		boolean actualEnabled = inputbox .isEnabled();
		System.out.println("actualaEnabled:"+actualEnabled);
		Assert.assertEquals(expectedEnabled, actualEnabled);

		String expcetedwatermarkData = inputbox.getAttribute("arial-label");
		String actualWatermarkData	 = "emial or phone";
		
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(expcetedwatermarkData,actualWatermarkData);
		sAssert.assertAll();

		
		inputbox.sendKeys("RBG technologies");
		String actualEnterData = inputbox.getAttribute("value");
		String expectedEnterData = "RBG technologies";
		SoftAssert sAssert1 = new SoftAssert();
		sAssert1.assertEquals(expectedEnterData, actualEnterData);
		sAssert1.assertAll();

	}
	

}



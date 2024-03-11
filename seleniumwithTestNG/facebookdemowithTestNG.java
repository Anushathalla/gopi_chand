package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class facebookdemowithTestNG 
{
	@Test
	public void facebookverification() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement  facebookinputbox= driver.findElement(By.xpath("//input[@id ='email']"));

		boolean expectedDisplay = true;
		boolean actualDisplay =  facebookinputbox .isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);

		Assert.assertEquals(expectedDisplay, actualDisplay);

		boolean expectedEnable = true;
		boolean actualEnable =  facebookinputbox .isEnabled();
		System.out.println("actualEnable:"+actualEnable);

		Assert.assertEquals(expectedEnable, actualEnable);

		String actualWatermarkData = facebookinputbox .getAttribute("aria-label");
		System.out.println("actualWatermarkData:"+actualWatermarkData);
		String expectedWatermarkData ="Email address or phone number";

		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(expectedWatermarkData,actualWatermarkData);
		sAssert.assertAll();

		String expectedEnterData = "RBG technologies";
		String  actualEnterData = facebookinputbox .getAttribute("value");

		SoftAssert sAssert1 = new SoftAssert();
		sAssert1.assertEquals(expectedEnterData,actualEnterData);
		sAssert1.assertAll();
	}




}


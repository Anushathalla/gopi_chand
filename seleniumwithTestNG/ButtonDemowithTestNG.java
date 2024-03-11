package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ButtonDemowithTestNG
{

@Test
	public void buttonverification()
	{
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement loginButton= driver.findElement(By.xpath("//button[@name='login']"));

		boolean expectedDisplay = true;
		boolean actualDisplay = loginButton.isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		Assert.assertEquals(expectedDisplay, actualDisplay);

		boolean expectedEnabled = true;
		boolean actualEnabled =loginButton .isEnabled();
		System.out.println("actualaEnable:"+actualEnabled);
		Assert.assertEquals(expectedEnabled, actualEnabled);

		String actualloginButton=loginButton.getText();
		System.out.println("actualloginButton:="+actualloginButton);
		String expectedloginButton ="Log In";

		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(expectedDisplay,actualDisplay);
		sAssert.assertAll();

		loginButton.click();
	}
}

package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TabletestwithTestNG 
{
	@Test
	public void tableverification()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();

		WebElement UserNameInputBox = driver.findElement(By.xpath("//input[@name='identifier']"));

		boolean expectedDisplay = true;
		boolean actualDisplay = UserNameInputBox.isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		Assert.assertEquals(expectedDisplay, actualDisplay);

		boolean expectedEnable = true;
		boolean actualEnable = UserNameInputBox.isEnabled();
		System.out.println("actualEnable:"+actualEnable);
		Assert.assertEquals(expectedEnable, actualEnable);

		String actualWatermarkData =UserNameInputBox.getAttribute("aria-label");
		System.out.println("actualWatermarkData:"+actualWatermarkData);
		String expectedWatermarkData ="Email or phone";
		
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(expectedWatermarkData,actualWatermarkData);
		sAssert.assertAll();


		String expectedEnterData = "RBG technologies";
		String  actualEnterData =UserNameInputBox.getAttribute("value");
		
		SoftAssert sAssert1 = new SoftAssert();
		sAssert1.assertEquals(expectedWatermarkData,actualWatermarkData);
		sAssert1.assertAll();

	}
}



















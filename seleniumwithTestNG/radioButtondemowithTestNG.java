package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class radioButtondemowithTestNG 
{
@Test
	public void radioButtonverification()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();

		WebElement radioButton = driver.findElement(By.xpath("//input[@name='tripType'and @value='oneway']"));	 																													
		boolean expectedDisplay = true;
		boolean actualDisplay = radioButton.isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		Assert.assertEquals(expectedDisplay, actualDisplay);

		boolean expectedEnable = true;
		boolean actualEnable = radioButton.isEnabled();
		System.out.println("actualaEnable:"+actualEnable);
		Assert.assertEquals(expectedEnable, actualEnable);

		boolean expectedSelected = true;
		boolean actualSelected = radioButton.isSelected();
		System.out.println("actualaSelected:"+actualSelected);
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(expectedSelected,actualSelected);
		sAssert.assertAll();

		radioButton.click();

		boolean expectedAfterSelected = true;
		boolean actualAfterSelected = radioButton.isSelected();
		System.out.println("actualaSelected:"+actualSelected);
		SoftAssert sAssert1 = new SoftAssert();
		sAssert1.assertEquals(expectedAfterSelected,actualAfterSelected);
		sAssert1.assertAll();

	}
}



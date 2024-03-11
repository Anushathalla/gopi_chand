package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBoxDemowithTestNG4
{
	@Test
	public void checkBoxverification()
	{


		WebDriver driver = new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		driver.manage().window().maximize();

		WebElement CheckBox  = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		boolean expectedDisplay = true;
		boolean actualDisplay =CheckBox .isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		Assert.assertEquals(expectedDisplay, actualDisplay);

		boolean expectedEnabled = true;
		boolean actualEnabled =CheckBox .isEnabled();
		System.out.println("actualaEnable:"+actualEnabled);
		Assert.assertEquals(expectedDisplay, actualDisplay);


		boolean expectedSelected = true;
		boolean actualSelected =CheckBox .isSelected();
		System.out.println("actualaSelected:"+actualSelected);
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(expectedDisplay,actualDisplay);
		sAssert.assertAll();


		CheckBox.click();
	}

}



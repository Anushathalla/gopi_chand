 package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBoxDemowithTestNG
{
@Test
	public void checkBoxDemoverification()
	{


		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();

		WebElement CheckBox  = driver.findElement(By.xpath("//span[@id = 'ContentHolder_lbFeatures_TG_D']"));

		boolean expectedDisplay = true;
		boolean actualDisplay =CheckBox .isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		Assert.assertEquals(expectedDisplay, actualDisplay);

		boolean expectedEnabled = true;
		boolean actualEnabled =CheckBox .isEnabled();
		System.out.println("actualaEnable:"+actualEnabled);
		Assert.assertEquals(expectedEnabled, actualEnabled);


		boolean expectedSelected = true;
		boolean actualSelected =CheckBox .isSelected();
		System.out.println("actualaSelected:"+actualSelected);
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(expectedDisplay,actualDisplay);
		sAssert.assertAll();


		CheckBox.click();
	}

}



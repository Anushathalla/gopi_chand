package seleniumwithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class checkBoxdemowithTestNG3

{
	 static WebDriver driver;

	@Test
	public  void checkBoxverification()
	{


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html"); 
		driver.manage().window().maximize();

		WebElement checkBox = driver.findElement(By.xpath("//input[@id='caddoptional']"));
		WebElement CheckBox  = driver.findElement(By.xpath("//*[@id='content']/div[4]/div/form/table/tbody/tr[6]/td/label/span"));
		boolean    expectedDisplay = true;
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
		int k[] = {27,11,33,56};
	}
	
	

public static  void clickCheckBoxList(int arr[])
{
	List<WebElement> clickCheckBoxList =driver.findElements(By.xpath("//input[@name ='checkbox'] "));
	

}
}




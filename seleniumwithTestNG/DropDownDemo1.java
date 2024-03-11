package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo1 
{
	@Test
	public void dropdown() throws InterruptedException

	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='tomonth']"));
		Select dropdownAddress = new Select(dropdown);
		dropdownAddress.selectByIndex(9);
		Thread.sleep(3000);
		dropdownAddress.selectByVisibleText("july");
		Thread.sleep(3000);
		dropdownAddress.selectByValue("12");
	}
}



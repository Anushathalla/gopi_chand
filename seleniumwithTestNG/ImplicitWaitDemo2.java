package seleniumwithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWaitDemo2 
{
	@Test	
	public void implicitWait() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		Case I
		WebElement checkbox3G =driver.findElement(By.xpath("//*[@id='kalyan sir']"));
		checkbox3G.click();


		WebElement checkboxmodel10 = driver.findElement(By.xpath("//*[@id='ContentHolder_lbModels_10_D']"));
		checkboxmodel10.click();
		
//		Case II

		WebElement checkboxBuletooth =  driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_Bluetooth_D']"));
		checkboxBuletooth .click();

 
		WebElement  checkboxModel11 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
		checkboxModel11.click();

	}
}

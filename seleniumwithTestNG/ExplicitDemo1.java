package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExplicitDemo1 
{
	@Test	
	public void explicit() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();

		WebElement checkbox =driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']"));
		checkbox.click();
		
		Thread.sleep(1000);
		
		
		WebElement model10 = driver.findElement(By.xpath("//*[@id='ContentHolder_lbModels_10_D']"));
		model10.click();


	}
}

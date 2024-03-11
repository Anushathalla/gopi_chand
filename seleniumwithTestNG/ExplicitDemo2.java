package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExplicitDemo2 
{
	@Test	
	public void explicit() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();

		WebElement checkbox3G =driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']"));
		checkbox3G.click();  
		
		Thread.sleep(30000);
		
		WebElement checkboxmodel10 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
		checkboxmodel10.click();


	}
}

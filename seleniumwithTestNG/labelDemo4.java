package seleniumwithTestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class labelDemo4 
{
	@Test
	public void labeldemo()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();

		WebElement label = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[2]/div/div[1]/span/div/div/a"));
		driver.manage().window().maximize();
		label.click();	
		Set<String> windowsIds =driver.getWindowHandles();
		Iterator<String>  windowsList = windowsIds.iterator();
		String parentwindowId= windowsList.next();
		String childwindowId= windowsList.next();
		driver.switchTo().window(childwindowId);
		WebElement labelText = driver.findElement(By.xpath("//*[@id='hcfe-content']/section/div/div[1]/article/section/h1"));
		System.out.println(labelText);


	}

}

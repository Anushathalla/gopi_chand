package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabelDemo3 
{
	@Test
	public void labeldemo()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		WebElement label = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));  
		String actuallabelText =label.getText();
		System.out.println("actuallabelText:"+actuallabelText);
		String expectedlabelText ="Saturday 3 January 2015";
		Assert.assertEquals(actuallabelText,expectedlabelText,"Data is not matching");
	}

}

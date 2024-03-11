package seleniumwithTestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeDemo2 
{
	@Test
	public void iframe()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
		driver.manage().window().maximize();

		driver.switchTo().frame(1); 
		WebElement label = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));  
		String actualLabel =label.getText();
		System.out.println(" The actualLabel is :"+actualLabel);
		String expectedlabel ="Saturday 3 January 2015";
		Assert.assertEquals(actualLabel, expectedlabel,"Data is not Matching");
		driver.switchTo().defaultContent();
		WebElement inputbox = driver.findElement(By.xpath("(//input[@id='text1'])[1]"));
		inputbox.sendKeys("Hyderbad");


	}
}






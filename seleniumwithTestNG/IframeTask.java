package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IframeTask 
{
	public class IframeTask1
	{
		@Test
		public void iframeTask() throws InterruptedException
		{
			WebDriver driver=new FirefoxDriver();
			driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
			driver.manage().window().maximize();
			WebElement frame1=driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/div/div/div[1]/h3"));
			driver.switchTo().frame(frame1);
			WebElement frame1_date=driver.findElement(By.xpath("//span[text()='Saturday 31 January 2015']"));
			String text1=frame1_date.getText();
			System.out.println("actual text of text1 : "+text1);

			driver.switchTo().defaultContent();
			WebElement inputBox=driver.findElement(By.xpath("//input[@type='text']"));
			inputBox.sendKeys(text1);

			Thread.sleep(3000);
			driver.switchTo().frame(frame1);
			WebElement inner_Frame1=driver.findElement(By.xpath("//iframe[@name='frame1']"));
			driver.switchTo().frame(inner_Frame1);
			WebElement inner_text1=driver.findElement(By.xpath("///*[@id='Blog1']/div[1]/div/h2/span']"));
			String text2=inner_text1.getText();
			System.out.println("actual inner text2 : "+text2);

			driver.switchTo().parentFrame();
			//driver.switchTo().frame(frame1);
			WebElement cityInputBox=driver.findElement(By.xpath("//input[@name='Town']"));
			cityInputBox.sendKeys(text2);

		}
	}	
}

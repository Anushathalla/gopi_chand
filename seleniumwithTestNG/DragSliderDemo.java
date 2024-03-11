package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragSliderDemo 
{
	@Test	
	public void Dragslider() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		Thread.sleep(3000);

		WebElement element =driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions act = new  Actions(driver);
		act.dragAndDropBy(element, 125, 0);
	}
}

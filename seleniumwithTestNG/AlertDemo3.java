package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo3 
{
	@Test
	public void label() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meghanabus.in/manage-bookings.html");
		driver.manage().window().maximize();

		WebElement  managebooking =driver.findElement(By.xpath("//a[@href ='manage-bookings.html']"));
		managebooking.click();
		Thread.sleep(4000);

		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();
		Thread.sleep(4000);
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alertText:"+ alertText);
		driver.switchTo().alert().accept();

		WebElement label = driver.findElement(By.xpath("//span[text()='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
		String actualData = label.getText();
		System.out.println("actualData");
	}


}


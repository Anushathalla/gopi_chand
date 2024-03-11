package seleniumwithTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo4 
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
		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		System.out.println("alertText:"+ alertText);

		alert.accept();
		Thread.sleep(500);


		WebElement label = driver.findElement(By.xpath("//span[text()='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
		String text = label.getText();
		System.out.println(" The label Text is :"+text);
	}


}


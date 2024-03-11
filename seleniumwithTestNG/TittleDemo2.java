package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TittleDemo2 
{
	@Test
	public void Tittle()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.xpath("//input[@Name = 'userName']"));
		userName.sendKeys("mercury");

		WebElement  password = driver.findElement(By.xpath("//input[@Name ='password']"));
		password.sendKeys("mercury");

		WebElement submit = driver.findElement(By.xpath("//input[@Name = 'submit']"));
		submit.click();

		String expectedData = "mercury Tours";
		System.out.println("expectedData:"+expectedData);




	}

}

package seleniumwithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TittleDemo1 
{
	@Test
	public void Tittle()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	driver.manage().window().maximize();

	 String pageTitle=driver.getTitle();
	 System.out.println("pageTitle:"+pageTitle);
	 
	 String expectedTittle = driver.getTitle();
	 System.out.println("expectedTittle:"+expectedTittle);
	}

}

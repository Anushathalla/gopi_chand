package seleniumwithTestNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementAndFindElementsDemo1
{
	@Test
	public void findElementTest()
	{
		WebDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.id("RBG"));
		driver.manage().window().maximize();

		List<WebElement>webelementslist = driver.findElements(By.id("RBG"));
		int Listsize =  webelementslist.size();
		System.out.println("listsize");
		System.out.println("Done");

	}

}

package seleniumwithTestNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo3 
{
	@Test
	public void webTable()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=loser*all$all$");
		driver.manage().window().maximize();

		WebElement webtable = driver.findElement(By.xpath("//td[text()='509895']"));
		String firstcolumnVaule = webtable.getText();
	    System.out.println("firstcolumnVaule:"+firstcolumnVaule);
	}
}


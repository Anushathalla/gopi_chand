package seleniumwithTestNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo5 
{
	@Test
	public void webTable()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=loser*all$all$");
		driver.manage().window().maximize();


		List<WebElement > allThirdcolumn  =driver.findElements(By.xpath("//table[@ng-show='GLData.Table.length > 0']/tbody/tr/td[1]"));
		int columnCount =allThirdcolumn.size();
		System.out.println("The columnCount is:"+columnCount);

		for(int j=1;j<=columnCount-1;j++)
		{	
			String thirdColumnValue = allThirdcolumn.get(j).getText();
			System.out.println("The Third Column Values are: "+thirdColumnValue);

		}
	}
}







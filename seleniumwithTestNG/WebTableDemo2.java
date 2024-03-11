package seleniumwithTestNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo2 
{
	@Test
	public void webTable()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
		driver.manage().window().maximize();

		WebElement tableData =driver.findElement(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		String data1 = tableData.getText();
		//		System.out.println("The text of the first row first column data is: "+ data1);

		List<WebElement > row  =driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr"));
		int rowCount =row.size();
		//		System.out.println("The All Rows Count is: "+rowCount);

		List<WebElement > column  =driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td"));
		int columnCount =column.size();
		//		System.out.println("The Column Count of 1st Row is: "+columnCount);

		//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/thead/tr/td[1]

		String xpath1 = "//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[";
		String xpath2 = "]/td[";
		String xpath3 = "]";

		for(int i =1; i<=rowCount; i++)
		{
			for(int j=1;j<= columnCount; j++)
			{
				System.out.println("xpath : "+xpath1+i+xpath2+j+xpath3);
				WebElement Data =driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3));
				String columnValues = Data.getText();
				System.out.println("The Column Values are: "+columnValues);
			}
		}		


	}

	public void getData(String colName)
	{
	
	}
}

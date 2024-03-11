package seleniumwithTestNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo1 
{
	@Test
	public void webTable()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		driver.manage().window().maximize();

		WebElement webtable = driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]"));
		String firstcolumnVaule = webtable.getText();
	    System.out.println("firstcolumnVaule:"+firstcolumnVaule);
	     
		List<WebElement > row  =driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr"));
		int rowCount =row.size();
		System.out.println("The All Rows Count is: "+rowCount);

		List<WebElement > column  =driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr/td[1]"));
		int columnCount =column.size();
		System.out.println("The columnCount is:"+columnCount);
		
		String xpath1 =("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[");
		String xpath2 ="]/td[";
		String xpath3 = "]";
		
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=1;j<=columnCount;j++)
			{	
				System.out.println("xpath : "+ xpath1+i+xpath2+j+xpath3);
				
				WebElement Data =driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3));
				String ColumnValues = Data.getText();
				System.out.println("The Column Values are: "+ColumnValues);
			
			}
		}
	}
}
		
	    
	    
	



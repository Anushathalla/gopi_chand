package seleniumwithTestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PopupwindowDemo 

{
	@Test
	public void popupwindow()
	{
				WebDriver driver1 = new ChromeDriver();
		driver1.get("https://gmail.com");
		driver1.manage().window().maximize();

		WebElement linkData =driver1.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[2]/div/div[1]/span/div/div/a"));
		linkData.click();
	
		Set<String > windowIds = driver1.getWindowHandles();
		Iterator<String> windowList = windowIds.iterator();
//		String  parentwindowIds = windowList.next();
//		String childwindowIds = windowList.next();
		
		
	}
}
			



	



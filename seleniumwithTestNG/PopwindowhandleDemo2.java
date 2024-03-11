package seleniumwithTestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopwindowhandleDemo2 
{
	@Test
	public void funA() 
	{
		System.out.println(""); 
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		System.out.println("funA of PopwindowhandleDemo3");

		WebElement windowhandle=driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
		windowhandle.click();
		
		Set<String> windowshandles=driver.getWindowHandles();
		System.out.println("windowshandle  :"+windowshandles+driver.getTitle());
		Iterator<String>itertor=windowshandles.iterator();

		String parentid1=itertor.next();
		String childid1=itertor.next();
		driver.switchTo().window(childid1);

		WebElement basictext=driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
		String textprint= basictext.getText();
		System.out.println(textprint);
	}
}

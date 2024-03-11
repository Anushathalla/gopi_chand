package seleniumwithTestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopwindowhandleDemo1 
{
  @Test
  public void funA() 
  {
	  System.out.println("funA of PopwindowhandleDemo1");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//a[ text()='Learn more']")).click();
		
		
		Set<String>  windowids=driver.getWindowHandles();
		Iterator<String> windowlist =windowids.iterator();
		String parentwindow=windowlist.next();
		String childwindow=windowlist.next();
		
		driver.switchTo().window(childwindow);
		
		WebElement label =driver.findElement(By.xpath("//*[text()='Browse Chrome as a guest']"));
		
	    String actuallabeltext=	label.getText();
	    String excepetedlabeltext="Browse Chrome as a guest";
	    System.out.println("browser :"+actuallabeltext);
	    if(actuallabeltext.equals(excepetedlabeltext))
	    {
	    	System.out.println("label is matching");
	    }
	    else
	    {
	    	System.out.println("label is not matching");
	    	
	    }
	    
	         
  }
}

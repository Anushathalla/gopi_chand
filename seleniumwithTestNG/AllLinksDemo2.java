package seleniumwithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLinksDemo2 
{
	@Test
	public void AllLinks()
	{
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.bbc.com/");
	driver.manage().window().maximize();

	List<WebElement> AllLink = driver.findElements(By.tagName("a"));
	int linkscount =AllLink.size();
	System.out.println("The link count are:"+linkscount);





}
}

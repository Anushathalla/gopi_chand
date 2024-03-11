package seleniumwithTestNG;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class BrokenLinkDemo3b 
{
	@Test
	public void brokenLink() throws IOException
	{
		
		URL url = new URL("https://rbgtechnologies.com/");

		HttpURLConnection hurl =( HttpURLConnection)url.openConnection();
		int responsecode = hurl.getResponseCode();
		System.out.println("responsecode:"+responsecode);
		if(responsecode>=400)
		{
			System.out.println("link is broken");
		}

		else
		{
			System.out.println("link is working fine");
		}
	}


}



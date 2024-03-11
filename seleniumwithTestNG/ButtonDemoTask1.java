package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemoTask1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/button/");

		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frame1);

		WebElement login_Button=driver.findElement(By.xpath("//input[@class='ui-button ui-widget ui-corner-all']"));

		//displayed
		boolean login_Button_ActualDisplayed=login_Button.isDisplayed();
		System.out.println("login_Button_ActualDisplayed : "+login_Button_ActualDisplayed);
		boolean login_Button_ExpectedDisplayed=true;
		if(login_Button_ActualDisplayed==login_Button_ExpectedDisplayed)
		{
			System.out.println("Button is displayed");
		}
		else
		{
			System.out.println("Button is not displayed");
		}

		//enabled
		boolean login_Button_ActualEnable=login_Button.isEnabled();
		System.out.println("login_Button_ActualEnable : "+login_Button_ActualEnable);
		boolean passWord_Input_Box_ExpectedEnable=true;
		if(login_Button_ActualEnable==passWord_Input_Box_ExpectedEnable)
		{
			System.out.println("Button is Enabled");
		}
		else
		{
			System.out.println("Button is not Enabled");
		}

		//Dataverify


		String actual_login_ButtonName=login_Button.getAttribute("value");
		System.out.println("actual_Data : "+actual_login_ButtonName);

		String expected_login_ButtonName="A submit button";
		if(actual_login_ButtonName.equals(expected_login_ButtonName))
		{
			System.out.println("Button text is same as expected");
		}
		else 
		{
			System.out.println("Button text is same as not expected");
		}

		login_Button.click();
	}

}

package CMSBenz;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CMSBenzRead.ReadExcel;
import CMSBenzRead.ReadProperties;

public class Register {

	CommonFunctions common = new CommonFunctions();
	WebDriver driver;
	@BeforeTest
	public void loadBrowser() throws Exception {
		common.openBrowser("chrome");
		common.getURL(ReadProperties.readProperties("url"));
		common.maximizeScreen();
		common.waitForTime(20);
	}
	@Test(priority=1)
	public void UserRegistration() throws Exception 
	{
		
		common.inputForSendKeysAndClick(ReadProperties.readProperties("Registerlink") ,ReadExcel.getValue(""),"click");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("firstname"),ReadExcel.getValue("firstnamecms"), "input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("lastname"),ReadExcel.getValue("lastnamecms"), "input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("Emails"),ReadExcel.getValue("Emailcms"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("EmployeeNumber"),ReadExcel.getValue("EmployeeNumbercms"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("UserName"),ReadExcel.getValue("UserNamecms"),"input");
		common.dp(ReadProperties.readProperties("Designation"), 3);
		common.inputForSendKeysAndClick(ReadProperties.readProperties("MobileNumber"),ReadExcel.getValue("MobileNumbercms"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("RegisterButton"),ReadExcel.getValue(""),"click");
		common.sleep(3000);
		common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\UserRegistration.png");

	}
	@Test(priority=2)
	public void invaildregistration() throws Exception 
	{
		common.inputForSendKeysAndClick(ReadProperties.readProperties("Registerlink") ,ReadExcel.getValue(""),"click");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("firstname"),ReadExcel.getValue("firstnamecms"), "input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("lastname"),ReadExcel.getValue("lastnamecms"), "input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("Emails"),ReadExcel.getValue("Emailcms"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("EmployeeNumber"),ReadExcel.getValue("EmployeeNumbercms"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("UserName"),ReadExcel.getValue("UserNamecms"),"input");
		common.dp(ReadProperties.readProperties("Designation"), 1);
		common.inputForSendKeysAndClick(ReadProperties.readProperties("MobileNumber"),ReadExcel.getValue("MobileNumbercms"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("RegisterButton"),ReadExcel.getValue(""),"click");
		common.sleep(3000);
		common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\invaildregistration.png");
	}
	@Test(priority=3)
	public void cancelregistration() throws Exception 
	{
		common.inputForSendKeysAndClick(ReadProperties.readProperties("Registerlink") ,ReadExcel.getValue(""),"click");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("CancelButton"),ReadExcel.getValue(""),"click");
		common.sleep(3000);
		common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\cancelregistration.png");
	}

			
//	@AfterTest
//	public void closeBrowser() throws Exception{
//		common.closeBrowser();
//	}

}
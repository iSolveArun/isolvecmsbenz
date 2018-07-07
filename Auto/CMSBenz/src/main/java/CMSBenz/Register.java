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
	static WebDriver driver;
	String expectedText = "Forgot Password";
	@BeforeTest
	public void loadBrowserr() throws Exception {
		common.openBrowser("chrome");
		common.getURL(ReadProperties.readProperties("url"));
		common.maximizeScreen();
		common.waitForTime(20);
	}
	@Test(priority = 1)
	public void userRegistration() throws Exception {
		common.inputForSendKeysAndClick(ReadProperties.readProperties("register_ink"), ReadExcel.getValue(""), "click");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("firstname_reg"), ReadExcel.getValue("firstname_reg_pg"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("lastname_reg"), ReadExcel.getValue("lastname_reg_pg"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("email_reg"), ReadExcel.getValue("email_reg_pg"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("employeeno_reg"),ReadExcel.getValue("employeeno_reg_pg"), "input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("username_reg"), ReadExcel.getValue("username_reg_pg"),"input");
		common.dp(ReadProperties.readProperties("designation_reg"), 3);
		common.inputForSendKeysAndClick(ReadProperties.readProperties("mobileno_reg"),ReadExcel.getValue("mobileno_reg_pg"), "input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("registerbtn_reg"), ReadExcel.getValue(""),"click");
		common.sleep(3000);
		common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\userRegistration.png");
	}
	@Test(priority = 2)
	public void invaildRegistration() throws Exception {
		common.inputForSendKeysAndClick(ReadProperties.readProperties("register_ink"), ReadExcel.getValue(""), "click");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("firstname_reg"), ReadExcel.getValue("firstname_reg_pgg"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("lastname_reg"), ReadExcel.getValue("lastname_reg_pgg"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("email_reg"), ReadExcel.getValue("email_reg_pgg"),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("employeeno_reg"),ReadExcel.getValue("employeeno_reg_pgg"), "input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("username_reg"), ReadExcel.getValue("username_reg_pgg"),"input");
		common.dp(ReadProperties.readProperties("designation_reg"), 1);
		common.inputForSendKeysAndClick(ReadProperties.readProperties("mobileno_reg"),ReadExcel.getValue("mobileno_reg_pgg"), "input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("registerbtn_reg"), ReadExcel.getValue(""),"click");
		common.sleep(3000);
		common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\invaildRegistration.png");
	}
	@Test(priority = 3)
	public void emptyRegistration() throws Exception {
		common.inputForSendKeysAndClick(ReadProperties.readProperties("register_ink"), ReadExcel.getValue(""), "click");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("firstname_reg"), ReadExcel.getValue(""),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("lastname_reg"), ReadExcel.getValue(""),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("email_reg"), ReadExcel.getValue(""),"input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("employeeno_reg"),ReadExcel.getValue(""), "input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("username_reg"), ReadExcel.getValue(""),"input");
		common.dp(ReadProperties.readProperties("designation_reg"), 0);
		common.inputForSendKeysAndClick(ReadProperties.readProperties("mobileno_reg"),ReadExcel.getValue(""), "input");
		common.inputForSendKeysAndClick(ReadProperties.readProperties("registerbtn_reg"), ReadExcel.getValue(""),"click");
		common.sleep(3000);
		common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\emptyRegistration.png");
	}
	@Test(priority = 4)
	public void cancelRegistration() throws Exception {
		common.inputForSendKeysAndClick(ReadProperties.readProperties("cancelbtn_reg"), ReadExcel.getValue(""), "click");
		common.sleep(3000);
		common.takeScreenshot("D:\\Testing docs\\Projects\\Docs For CMS\\Auto Screen\\cancelRegistration.png");
	}
	 @AfterTest
	 public void closeBrowser() throws Exception{
		 common.sleep(3000);
		 common.closeBrowser();
}
}
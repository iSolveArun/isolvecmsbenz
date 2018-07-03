package CMSBenz;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CMSBenzRead.ReadExcel;
import CMSBenzRead.ReadProperties;

public class ForgetPassword {
	
		static WebDriver driver;
		CommonFunctions common = new CommonFunctions();
		
		@BeforeTest
		public void loadBrowser() throws Exception{
		common.openBrowser("chrome");
		common.getURL(ReadProperties.readProperties("url"));
		common.maximizeScreen();
		common.waitForTime(20);	
		}
		@Test
		public void forgetPasswordWithMailID() throws Exception{  
			
			System.out.println("Case1 ::: forgetPasswordWithMailID :::");
			common.inputForSendKeysAndClick(ReadProperties.readProperties("forgotPwdlink"), ReadExcel.getValue(""), "click");
			common.inputForSendKeysAndClick(ReadProperties.readProperties("reusername"), ReadExcel.getValue("reusername"), "input");
			WebElement mailID = (WebElement) common.inputForSendKeysAndClick(ReadProperties.readProperties("Email"), ReadExcel.getValue("Emaill"), "input");
			common.inputForSendKeysAndClick(ReadProperties.readProperties("resetbutton"), ReadExcel.getValue(""), "click");
			File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(image, new File("D:\\Senthil\\Java Program\\CMSBenz\\Screenshots\\forgetPasswordWithMailID-ForgetPassword.png"));
		
			String getMailID = mailID.getAttribute("value");
			System.out.println(getMailID);
			
			boolean mailID1 = validate(getMailID);
			if(mailID1) {
				System.out.println("Valid MailID");
			} else {
				System.out.println("InValid MailID");
			}
//			common.inputForSendKeysAndClick(ReadProperties.readProperties("resetbutton"), ReadExcel.getValue(""), "click");
//			driver.findElement(By.xpath("//input[@id='btnResetPassword']")).click();
//			File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileHandler.copy(image, new File("D:\\Senthil\\Java Program\\CMSBenz\\Screenshots\\forgetPasswordWithMailID-ForgetPassword.png"));
		}
		
		/*public void forgetPasswordWithOutMailID() throws Exception{  // Check forgetPassword WithOut MailID
			System.out.println("Case2 ::: forgetPasswordWithOutMailID :::");
			driver.findElement(By.xpath("//*[contains(text(),'Forgot Password')]")).click();
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("");
			driver.findElement(By.xpath("//input[@id='btnResetPassword']")).click();
		}
		
		
		public void closeButton() throws Exception{  // Check closeButton function
			System.out.println("Case3 ::: closeButton Check :::");
			driver.findElement(By.xpath("//*[contains(text(),'Forgot Password')]")).click();
			Thread.sleep(2000);
			WebElement closeBtn = driver.findElement(By.xpath("//*[@id='divForgotPasswordwindow']/div/div/div[3]/button"));     
			String buttontext = closeBtn.getText();			
			
			
			WebElement checkName = driver.findElement(By.xpath("//*[contains(text(), 'Forgot Password')]"));
			//System.out.println(checkName.getText());
			String ch_name = checkName.getText();
			
			closeBtn.click();
			System.out.println("Clicked Close button");
			Thread.sleep(2000);*/
			
			
//			if(driver.findElement(By.xpath("//*[@id='divForgotPasswordwindow']/div/div/div[3]/button")).isDisplayed()) {
//				System.out.println("Case Failed ::: Close function not works");
//			} else {
//				System.out.println("Case Passed ::: Close function works");
//			}
////			if(driver.findElement(By.xpath("//*[@id='divForgotPasswordwindow']/div/div/div[3]/button")) != null) {
////				System.out.println("Failed ::: Close Function nots Works");
////			} else {
////				System.out.println("Passed ::: Close Function Works");
////			}
			
		
		
		public Pattern ValidateMail = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		
		public boolean validate(String emailStr) {
			Matcher matcher = ValidateMail .matcher(emailStr);
			return matcher.find();
			}
//		public void closeBrowser() {
//			driver.close();
//		}
		
		
		@AfterTest
//		public void closeBrowser1() throws Exception{
//			common.closeBrowser();
//		}
//		
		public static void main(String[] args) throws Exception {
			
			ForgetPassword fog = new ForgetPassword();
			fog.loadBrowser();
			fog.forgetPasswordWithMailID();
//			fog.closeBrowser();
//			fog.loadBrowser();
//			fog.forgetPasswordWithOutMailID();
//			fog.closeBrowser();
//			fog.loadBrowser();
//			fog.closeButton();
			//fog.closeBrowser();			
		}
}

/*package CMSBenz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CMSBenzRead.ReadExcel;
import CMSBenzRead.ReadProperties;


public class Master {

	CommonFunctions common = new CommonFunctions();
	WebDriver driver;
	@BeforeTest
	public void loadBrowser() throws Exception {
		common.openBrowser("chrome");
		common.getURL(ReadProperties.readProperties("url"));
		common.maximizeScreen();
		common.waitForTime(20);

		@Test(priority=1)
		public void Designation() throws Exception 
		{
		common.inputForSendKeysAndClick(ReadProperties.readProperties("mas_Designation"),ReadExcel.getValue(""), "input");	
		common.inputForSendKeysAndClick(ReadProperties.readProperties(""), ReadExcel.getValue(""),"click");	
		}
		driver.findElement(By.xpath("html/body/nav[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='Designation']/div/div[3]/div/table/tbody/tr[1]/td[2]")).click();
		Select dropdown = new Select(driver.findElement(By.id("idDesignationStatus")));
		dropdown.selectByVisibleText("Inactive");
		driver.findElement(By.id("btnSave_Designation")).click();
		driver.findElement(By.id("btnCancel_Designation")).click();
		
		@Test(priority=2)
		public void Lounge() throws Exception 
		{
		
		
		//Lounge
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='Lounge']/div/div[3]/div/table/tbody/tr[1]/td[2]")).click();
		Select dropdown1 = new Select(driver.findElement(By.id("idDesignationStatus")));
		dropdown1.selectByVisibleText("Active");
		driver.findElement(By.id("btnSave_Lounge")).click();
		driver.findElement(By.id("btnCancel_Lounge")).click();
		//AppointmentType
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='AppointmentType']/div/div[3]/div/table/tbody/tr[1]/td[2]")).click();
		Select dropdown2 = new Select(driver.findElement(By.id("idDesignationStatus")));
		dropdown2.selectByVisibleText("Active");
		driver.findElement(By.id("btnSave_AppointmentType")).click();
		driver.findElement(By.id("btnCancel_AppointmentType")).click();
		
		//EnquiryType
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/ul/li[4]/a")).click();
		driver.findElement(By.xpath(".//*[@id='EnquiryType']/div/div[3]/div/table/tbody/tr[1]/td[2]")).click();
		Select dropdown3 = new Select(driver.findElement(By.id("idDesignationStatus")));
		dropdown3.selectByVisibleText("Active");
		WebElement element = driver.findElement(By.xpath(".//*[@id='file_EnquiryIcon']"));
		element.sendKeys("C:\\Users\\ma12828\\Desktop\\boss_man-512.png");
		driver.findElement(By.id("btnSave_EnquiryType")).click();
		
		//ProductGroup
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/ul/li[5]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ProductGroup']/div/div[3]/div/table/tbody/tr[1]/td[2]")).click();
		Select dropdown4 = new Select(driver.findElement(By.id("idDesignationStatus")));
		dropdown4.selectByVisibleText("Active");
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='file_ProductGroupIcon']"));
		element1.sendKeys("C:\\Users\\ma12828\\Desktop\\boss_man-512.png");
		driver.findElement(By.id("btnSave_ProductGroup")).click();
		// Product Name
	
	
	
	
	
	
	}
	
	

}
*/
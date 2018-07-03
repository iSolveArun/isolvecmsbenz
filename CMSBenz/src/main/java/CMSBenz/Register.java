package CMSBenz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import CMSBenzRead.ReadProperties;

public class Register {
	
	static WebDriver driver;
	
	public void loadBrowser() throws Exception{  // Loading Browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ReadProperties.readProperties("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		}

	public void UserRegistration () throws Exception{
		
		driver.findElement(By.id("FirstName")).sendKeys("Arun");
		driver.findElement(By.id("LastName")).sendKeys("Magesh$");
		driver.findElement(By.id("Email")).sendKeys("barani31190@gmail.com");
		driver.findElement(By.id("EmployeeNumber")).sendKeys("ma12828");
		driver.findElement(By.id("UserName")).sendKeys("Autotest");
		Select dropdown = new Select(driver.findElement(By.id("Designation")));
		dropdown.selectByIndex(0);
		driver.findElement(By.id("MobileNumber")).sendKeys("CMS123$");	
		driver.findElement(By.id("btnRegister")).click();

	}

	public void invaildregistration () throws Exception{
		
		driver.findElement(By.id("FirstName")).sendKeys("Arun");
		driver.findElement(By.id("LastName")).sendKeys("Magesh$");
		driver.findElement(By.id("Email")).sendKeys("barani31190@gmail.com");
		driver.findElement(By.id("EmployeeNumber")).sendKeys("ma12828");
		driver.findElement(By.id("UserName")).sendKeys("Autotest");
		Select dropdown = new Select(driver.findElement(By.id("Designation")));
		dropdown.selectByIndex(0);
		driver.findElement(By.id("MobileNumber")).sendKeys("CMS123$");	
		driver.findElement(By.id("btnRegister")).click();
	}
	public void cancelregistration () throws Exception{
		
			driver.findElement(By.id("btnCancel")).click();
	}
		

	public static void main(String[] args) throws Exception {
		
		Register reg = new Register();
		reg.UserRegistration();
		reg.invaildregistration();
		reg.cancelregistration();
	}
}

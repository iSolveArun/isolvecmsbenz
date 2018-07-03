package CMSBenz;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonFunctions {
	public WebDriver driver;

public void getURL(String url) {
	driver.get(url);
}
public void openBrowser(String browser) throws Exception{
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing docs\\chromedriver.exe");
		driver = new ChromeDriver();
	} else if (browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing docs\\geckodriver.exe");
		driver = new FirefoxDriver();
	} else if (browser.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver", "D:\\Testing docs\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	} else {
		System.out.println("No Match with any browser...");
	}
}

public void waitForTime(int time) {
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}

public void maximizeScreen() {
	driver.manage().window().maximize();
}

public Object inputForSendKeysAndClick(String locator, String sendkeysvalue, String cat) {
	WebElement loc = null;		
try {
String[] part = locator.split("\\|");
String locObj = part[0].trim();
String locType = part[1].trim().toUpperCase();

switch (locType) {
case "ID":
loc = driver.findElement(By.id(locObj));
break;
case "NAME":
loc = driver.findElement(By.name(locObj));
break;
case "CSSSELECTOR":
loc = driver.findElement(By.cssSelector(locObj));
break;
case "XPATH":
loc = driver.findElement(By.xpath(locObj));
break;
case "LINKTEXT":
loc = driver.findElement(By.linkText(locObj));
break;
case "PARTIALLINKTEXT":
loc = driver.findElement(By.partialLinkText(locObj));
break;
case "TAGNAME":
loc = driver.findElement(By.tagName(locObj));
break;
case "CLSSNAME":
loc = driver.findElement(By.className(locObj));
break;
}
if (cat.equalsIgnoreCase("input")) {
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loc);
	loc.clear();
	loc.sendKeys(sendkeysvalue );
}	else if (cat.equalsIgnoreCase("click")) {
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loc);
	loc.click();
} else {
	System.out.println("webdriver not able to recogonoze the catagory you have been specified..!!!!");
}
} catch  (Exception e) {
System.out.println(e);
}
return driver;

}

public void takeScreenshot(String pathAndName) throws IOException {
	File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(image, new File(pathAndName));
}

public void closeBrowser() {
	driver.close();
}

public void printMessage(String text) {
	System.out.println(text);
}

public void handleAlerts(String alertType, String sendValue) {
	
if(alertType.equalsIgnoreCase("Yes")) {
	driver.switchTo().alert().accept();
} else if(alertType.equalsIgnoreCase("no")) {
	driver.switchTo().alert().dismiss();
} else if(alertType.equalsIgnoreCase("senValue")) {
	driver.switchTo().alert().sendKeys(sendValue);
} else if(alertType.equalsIgnoreCase("getValue")) {
	driver.switchTo().alert().getText();
	} 
}

public String getPageTitle() {
	String homeTilte = driver.getTitle();
	return homeTilte;
}
public void sleep(int time) throws InterruptedException {
	Thread.sleep(time);
}

}


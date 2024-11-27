package Test1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		ChromeOptions options = new ChromeOptions();
//        options.setCapability("browserVersion", "131.0.6778.85");
//		System.setProperty("webdriver.chrome.driver", "C:\\Prem\\Eclipse test\\chrome-win64\\chrome-win64\\chrome.exe");
//		
//	
//		try { 
//			TimeUnit.SECONDS.sleep(5);
//		} catch (InterruptedException e) 
//		{ 
//			e.printStackTrace(); 
//			}
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> languages=driver.findElements(By.xpath("//*[@id='SIvCob']//a"));
		languages.get(4).click();
		Calendar calendar = Calendar.getInstance();
	    SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	    SimpleDateFormat formater1 = new SimpleDateFormat("dd_MM_yyyy_hh_mm");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			File targetFile = new File("Test/src/Test1/Screenshots_"+formater1.format(calendar.getTime())+"/"+ "New"+formater.format(calendar.getTime()) + ".png");
	        FileUtils.copyFile(screenshot, targetFile);

		}catch (Exception e) {
	        System.out.println("An exception occured while taking screenshot " + e.getCause());
	        return;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		driver.navigate().to("http://www.javatpoint.com/");
		driver.manage().window().maximize();
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
		// Save the screenshot to a file 
		try {
			FileUtils.copyFile(screenshot, new File("screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement dropdown=driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle' and contains(text(),'Tutorials')]"));
		dropdown.click();
		WebElement element = driver.findElement(By.xpath("//*[@href='/cucumber-testing']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
//		Actions action=new Actions(driver);
//		action.moveToElement(element).perform();
//		action.click(element);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//		wait.until(new ExpectedCondition<Boolean>() { 
//			public Boolean apply(WebDriver driver) { 
//				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"); }
//		});
//		WebElement text=driver.findElement(By.xpath("//*[@id=\"city\"]/table/tbody/tr/td/p[1]"));
//		List<WebElement> texts=driver.findElements(By.tagName("p"));
//		for (WebElement newelement : texts) {
//		StringBuilder textToCopy = new StringBuilder(); 
//			textToCopy.append(text.getText()); 
//			StringSelection selection = new StringSelection(textToCopy.toString()); 
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null); 
//			// Simulate pressing Ctrl+C using AWT Robot 
//			
//			Robot robot = new Robot(); 
//			robot.keyPress(KeyEvent.VK_CONTROL); 
//			robot.keyPress(KeyEvent.VK_C); 
//			robot.keyRelease(KeyEvent.VK_C); 
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//			
//			System.out.println("Text copied to clipboard: \n" + textToCopy.toString());*/
	driver.quit();  
	}

}

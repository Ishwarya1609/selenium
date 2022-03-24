package robottest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rbtest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//to call the predefined classes of selenium
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//to get the URL
		driver.get("https://triotend.com/");
		
		//using Robot class to perform keyboard actions
		Robot rb=new Robot();
		
		//to press the tab key
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		

	}

}

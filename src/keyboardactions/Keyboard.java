package keyboardactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		//to call the predefined classes of selenium
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//to get the URL
		driver.get("https://www.google.co.in/");
		
		//to perform keyboard actions
		Actions act=new Actions(driver);
		
		//to press the tab button[in sendkeys method, there won't be alphabets alone]
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB).build().perform();

	}

}

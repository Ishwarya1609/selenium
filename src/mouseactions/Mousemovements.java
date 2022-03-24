package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousemovements {

	public static void main(String[] args) {
		//to call the predefined classes of selenium
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//to get the URL
		driver.get("http://triotend.com/ecom/");
		
		//to store the main menu button in a webelement
		WebElement mainmenu=driver.findElement(By.cssSelector("ul.main-header-menu>li"));
		//to store the submenu in a webelement
		WebElement submenu=driver.findElement(By.cssSelector("ul.sub-menu>li:nth-child(2)"));
		
		//to perform mouse actions
		Actions act=new Actions(driver);
		
		//to make mouse movement to the main menu
		act.moveToElement(mainmenu).build().perform();
		//wait time for the menu to display
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//to make the mouse to move to the submenu and click it
		act.moveToElement(submenu).click().build().perform();
		
		
	}

}

package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseclick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//To get the URL
		driver.get("http://treecutting.triotend.com/documents.php");
		//wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		
		//to store the element in a webelement
		WebElement choose=driver.findElement(By.cssSelector("input#picture"));
		
		//for mouse actions
		Actions act=new Actions(driver);
		
		//to click on the element using mouse pointer
		act.click(choose).build().perform();
		
		
		
		
		
		

	}

}

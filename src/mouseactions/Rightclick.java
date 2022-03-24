package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick {

	public static void main(String[] args) {
		//to call the predefined programs of selenium
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//to get the URL
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//to store the button in a webelement
		WebElement btn=driver.findElement(By.cssSelector("span.context-menu-one"));
		
		//to perform mouse actions
		Actions act=new Actions(driver);
		
		//to right-click on the button
		act.contextClick(btn).build().perform();
		
		
		

	}

}

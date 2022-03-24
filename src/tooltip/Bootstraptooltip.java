package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstraptooltip {

	public static void main(String[] args) {
		
		//to call the predefined classes of selenium
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//to get the URL
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tooltip.asp");
		
		//to inspect the hover button and store in a webelement
		WebElement hover=driver.findElement(By.cssSelector("button.btn-success"));
		
		//to move the move pointer on the element
		//to perform mouse action
		Actions act=new Actions(driver);
		act.moveToElement(hover).build().perform();
		
		//to inspect the tooltip and store in a webelement
		WebElement tooltip=driver.findElement(By.cssSelector("div.tooltip-inner"));
		
		//to print the text in the tooltip in console
		System.out.println(tooltip.getText());
		
		
		
		
		
	}

}

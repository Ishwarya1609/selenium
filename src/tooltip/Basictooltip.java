package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basictooltip {

	public static void main(String[] args) {
		
		//to call the predefined classes of selenium
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//to get the URL
		driver.get("http://triotend.com/ecom/");
		
		//need to inspect the element[cart] 
		WebElement cart=driver.findElement(By.cssSelector("span.count"));
		
		//to move the mouse pointer on the element[cart]
		//for performing mouse actions
		Actions act=new Actions(driver);
		
		act.moveToElement(cart).build().perform();
		
		//to inspect the tooltip
		WebElement tooltip=driver.findElement(By.cssSelector("p.woocommerce-mini-cart__empty-message"));
		
		//to get the text of the tooltip and print in console
		System.out.println(tooltip.getText());
		
		
		
		
	}

}

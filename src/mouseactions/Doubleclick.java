package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doubleclick {

	public static void main(String[] args) {
		
		//calling the predefined classes
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//to get the URL
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		
		//to store the frames in a webelement
		WebElement frm=driver.findElement(By.cssSelector("iframe#iframeResult"));
		//switch the ctrl to frames
		driver.switchTo().frame(frm);
		
		//to store the button in a webelement
		WebElement btn=driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		
		//to perform the mouse action
		Actions act=new Actions(driver);
		
		//to doubleclick the button using mouse
		act.doubleClick(btn).build().perform();
		
		
		
		



	}

}

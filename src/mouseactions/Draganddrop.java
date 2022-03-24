package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) {
		
		//to call the predefined classes of selenium
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//to get the URL
		driver.get("https://jqueryui.com/droppable/");
		
		//to store the frames in a webelement
		WebElement frm=driver.findElement(By.cssSelector("iframe.demo-frame"));
		//to switch the driver to frames
		driver.switchTo().frame(frm);
		
		//to store the source and target in separate webelements
		WebElement source=driver.findElement(By.cssSelector("div#draggable"));
		WebElement target=driver.findElement(By.cssSelector("div#droppable"));
		
		//to perform mouse action
		Actions act=new Actions(driver);
		
		//to drag the source and drop in its target
		act.dragAndDrop(source, target).build().perform();
		
		
		
		
		

	}

}

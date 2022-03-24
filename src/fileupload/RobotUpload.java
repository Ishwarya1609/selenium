package fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//to call all the predefined classes of selenium
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				
		//to get the URL
		driver.get("http://treecutting.triotend.com/documents.php");
				
		//to store the upload button in a webelement
		WebElement upbtn=driver.findElement(By.cssSelector("input#picture"));
				
		//to perform the mouse action
		Actions act=new Actions(driver);
				
		//to click the upload button
		act.click(upbtn).build().perform();
		
		//file upload script
		Thread.sleep(4000);
		//to store the location of the file in a string class
		StringSelection sel=new StringSelection("D:\\fileupload.docx");
		//to copy the location of the file, we need to use another class
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		//to paste the location of the file in the location textbox
		//to highlight the location textbox we need to press and release the Enter press.
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		//to paste we use ctrl+V.in robot class we use the below methods for this.
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		//to click the open button we need to press the "Enter" button again
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}		

}

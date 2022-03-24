package fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoit {

	public static void main(String[] args) throws IOException, InterruptedException {
		
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
		Runtime.getRuntime().exec("./src/DRIVERS/Uploadfile.exe"+" "+"D:\\fileupload.docx");
		
		
		
		

	}

}

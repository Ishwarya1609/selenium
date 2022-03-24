package Webdriverlisteners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listener {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		
		EventFiringWebDriver event=new EventFiringWebDriver(driver);
		Activitycapture actcap=new Activitycapture();
		
		event.register(actcap);
		driver=event;
		
		
		
		//explicit wait	time
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
//script to login				
		driver.get("http://triotend.com/tts/site/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("triotend@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("triotend");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
//script to click on the front office menu	
		WebElement frontoffice=driver.findElement(By.cssSelector("ul.sidebar-menu>li"));
		wait.until(ExpectedConditions.elementToBeClickable(frontoffice));
		frontoffice.click();
//script to click on the visitor book		
		WebElement visitorbook=driver.findElement(By.cssSelector("div.box-tools>a:nth-of-type(2)"));
		wait.until(ExpectedConditions.elementToBeClickable(visitorbook));
		visitorbook.click();
//script to click on the Add visitor 			
		WebElement addvistior=driver.findElement(By.cssSelector("div.box-tools>a"));
		wait.until(ExpectedConditions.elementToBeClickable(addvistior));
		addvistior.click();
		

	}

}

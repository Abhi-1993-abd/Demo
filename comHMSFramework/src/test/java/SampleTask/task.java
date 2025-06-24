package SampleTask;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task {
	
	@Test
	public void alert() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/alerts");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,500);");
	
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Hello");
	alert.accept();
	
	}

}

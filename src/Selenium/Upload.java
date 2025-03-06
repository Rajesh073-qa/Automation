//File upload pop ups choose file in grotech minds  registration website
package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		 ChromeDriver d=new ChromeDriver();
		    d.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		    d.manage().window().maximize();
		    d.get("https://grotechminds.com/registration/");
	        WebElement upload=d.findElement(By.xpath("//input[@name='file-935']"));
	        upload.sendKeys("C:\\Users\\csraj\\Downloads\\PESPS.pdf");    
	}

}

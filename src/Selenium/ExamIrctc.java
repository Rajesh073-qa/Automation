package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExamIrctc {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.irctc.co.in/nget/train-search");
		    driver.manage().window().maximize();
		    WebElement from=driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
		    from.sendKeys("Bangalore");
		    WebElement to=driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
		    to.sendKeys("delhi");
		    WebElement date=driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
		    date.click();
		    date.sendKeys(Keys.BACK_SPACE);
		    date.sendKeys(Keys.BACK_SPACE);
		    date.sendKeys(Keys.BACK_SPACE);
		    date.sendKeys(Keys.BACK_SPACE);
		    date.sendKeys(Keys.BACK_SPACE);
		    date.sendKeys(Keys.BACK_SPACE);
		    date.sendKeys(Keys.BACK_SPACE);date.sendKeys(Keys.BACK_SPACE);date.sendKeys(Keys.BACK_SPACE);
		    Thread.sleep(2000);
		    date.sendKeys("31/12/2023");
		    date.sendKeys(Keys.ENTER);
            WebElement quota=driver.findElement(By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
		    Select d1=new Select(quota);
		    Thread.sleep(2000);
	        d1.selectByVisibleText("GENERAL"); 
		    WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		    button.click();
		    
	}

}

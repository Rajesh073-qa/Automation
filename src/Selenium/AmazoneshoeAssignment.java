//Launch amazon. Search shoes and press enter key using relative xpath
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneshoeAssignment {

	public static void main(String[] args) {
    ChromeDriver s=new ChromeDriver();
    s.get("https://www.amazon.in");
    s.manage().window().maximize();
    WebElement Searchfield=s.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    Searchfield.sendKeys("Shoe");
    Searchfield.sendKeys(Keys.ENTER);
	}

}

//Use xpath for FB login page to loginpackage Selenium;
package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginaasignment {

	public static void main(String[] args) {
    FirefoxDriver d=new FirefoxDriver();
    d.manage().window().maximize();
    d.get("https://www.facebook.com");
    WebElement UN=d.findElement(By.xpath("//input[@id='email']"));
    UN.sendKeys("cs.rajesh073@gmail.com");
    WebElement Password= d.findElement(By.xpath("//input[@id='pass']"));
    Password.sendKeys("Pallavi073@");
    WebElement button=d.findElement(By.name("login"));
    button.click();    
	}

}

//Automate Grotech minds website registration page
package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroRegister {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver d=new ChromeDriver();
    d.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    d.manage().window().maximize();
    d.get("https://grotechminds.com/registration/");
    WebElement username=d.findElement(By.xpath("//input[@id='1']"));
    username.sendKeys("Rajesh073");
    WebElement password=d.findElement(By.id("3"));
    password.sendKeys("7851raj");
    WebElement firstname= d.findElement(By.name("text-397"));
    firstname.sendKeys("Rajesh");
    WebElement Lastname=d.findElement(By.xpath("//input[@placeholder='Your Last name:']"));
    Lastname.sendKeys("C S");   
    Thread.sleep(2000);
    WebElement skills =d.findElement(By.xpath("(//span[.='—Please choose an option—'])[1]"));
    Select s1=new Select(skills);
    s1.selectByVisibleText("Technical Skills");
    WebElement country=d.findElement(By.xpath("//span[@class='select2-results']/ul/li"));
    Thread.sleep(200);
    Select s2=new Select(country);
    s2.selectByVisibleText("India");
    WebElement address=d.findElement(By.name("paddress"));
    address.sendKeys("Random Address");
    WebElement Paddress=d.findElement(By.name("permanentaddress"));
    Paddress.sendKeys("Permanent address");
    WebElement pincode =d.findElement(By.xpath("//input[@placeholder='pincode']"));
    pincode.sendKeys("577201");
    WebElement upload=d.findElement(By.name("file-935"));
    upload.sendKeys("file:///C:/Users/csraj/Downloads/20005919727_394493412_10_2023.pdf");
	}

}

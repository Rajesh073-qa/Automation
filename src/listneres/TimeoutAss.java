package listneres;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListeners.class)
public class TimeoutAss 
{
@Test(timeOut=1000)
public void login() throws InterruptedException
{

    ChromeDriver d=new ChromeDriver();
	    d.get("https://www.amazon.in");
	    d.manage().window().maximize();
	    WebElement link=d.findElement(By.linkText("Your Account"));
	    link.click();
	    WebElement search=d.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("Shoes");
	    search.sendKeys(Keys.ENTER);
	    WebElement product=d.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
	    product.click();
	    Set<String> k= d.getWindowHandles();   
	    Iterator<String> f=k.iterator();
	    String id1=f.next();
	    String id2=f.next();
	    d.switchTo().window(id2);
	    WebElement buybutton=d.findElement(By.id("buy-now-button"));
	    buybutton.click();
	    WebElement userid=d.findElement(By.id("ap_email"));
	    userid.sendKeys("8867820793");
	    WebElement cont=d.findElement(By.id("continue"));
	    cont.click();
	    WebElement pwd=d.findElement(By.id("ap_password"));
	    pwd.sendKeys("Rajesh073@");
	    Thread.sleep(1000);
	    pwd.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	    Scanner s1=new Scanner(System.in);
	    String otp=s1.next(); 
	    WebElement otpfield=d.findElement(By.id("input-box-otp"));
	    otpfield.sendKeys(otp);
	    WebElement submit=d.findElement(By.xpath("(//span[.='Submit code'])[1]"));
	    Thread.sleep(7000);
	    submit.click();  
      WebElement radiobtn=d.findElement(By.xpath("//input[@id='pp-ROJVkb-137']"));
	    radiobtn.click();
	    WebElement Addcardlink=d.findElement(By.xpath("//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']"));
	    Addcardlink.click();
}
}
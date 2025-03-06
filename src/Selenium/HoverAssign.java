//Goto Amazon hover over in Accounts and Lists using xpath by text and Find multiple options  and do log in
package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAssign {
	public static void main(String[] args) {
		ChromeDriver s=new ChromeDriver();
	    s.get("https://www.amazon.in");
	    s.manage().window().maximize();
	    WebElement hover= s.findElement(By.id("nav-link-accountList"));
	    Actions a=new Actions(s);
	    a.moveToElement(hover).perform();
	    WebElement signin=s.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	    signin.click();
	    WebElement loginfield=s.findElement(By.id("ap_email"));
	    loginfield.sendKeys("cs.rajesh073@gmail.com");
	    WebElement button = s.findElement(By.className("a-button-input"));
	    button.click();
	    WebElement pwdfield=s.findElement(By.id("ap_password"));
	    pwdfield.sendKeys("Rajesh073@");
	    WebElement loginbutton=s.findElement(By.id("signInSubmit"));
	    loginbutton.click();
	}

}

//Absolute xpath
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAbsolute {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/csraj/Downloads/learningHTML1.html");
    WebElement hinttf=	driver.findElement(By.xpath("(/html/body/input)[2]"));
    hinttf.sendKeys("password is my pet name");
    WebElement firstname=	driver.findElement(By.xpath("(/html/body/form/input)[1]"));
    firstname.sendKeys("Ram");
    WebElement boycheckbox=	driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
    boycheckbox.click();
 
    	}

}

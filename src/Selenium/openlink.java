//Launch google and click on Gmail using Link Text operator
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class openlink {

	public static void main(String[] args) {
    EdgeDriver driver=new EdgeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    WebElement link=driver.findElement(By.linkText("Gmail"));
    link.click();
	}

}

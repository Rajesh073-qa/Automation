//Find the coordinates of the location using getLocation() method
package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinate {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in");
    WebElement link=driver.findElement(By.linkText("Australia"));
    Point XandY= link.getLocation();
    double X= XandY.getX();
    double Y= XandY.getY();
    System.out.println(X);
    System.out.println(Y);
	}

}

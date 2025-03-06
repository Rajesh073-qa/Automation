package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamCordinate {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://amazon.in");
    driver.manage().window().maximize();
    WebElement cordinate=driver.findElement(By.linkText("Canada"));
    Point xy=cordinate.getLocation();
    int x=xy.getX();
    System.out.println(x);
    int y=xy.getY();
    System.out.println(y);
	}

}

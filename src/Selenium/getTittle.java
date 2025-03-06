//"Launch flipkart and get the title of the page & print it

package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class getTittle {

	public static void main(String[] args) {
    ChromeDriver d1=new ChromeDriver();
    d1.manage().window().maximize();
    d1.get("https://flipkart.com");
    String a=d1.getTitle();
    d1.close();
    System.out.println(a);
	}

}

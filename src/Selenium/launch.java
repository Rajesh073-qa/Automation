package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in");
    Thread.sleep(3000);
    driver.close();
    driver.quit();
    
	}

}

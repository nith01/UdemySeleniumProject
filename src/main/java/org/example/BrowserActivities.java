package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {
    public static void main(String[] args) throws InterruptedException {
//Selenium Manager dont need the below line of code to
      //  System.setProperty("webdriver.chrome.driver", "C:/Users/nitha/Drivers/drivers/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(4000);
        driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.close();

    }
}

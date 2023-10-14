package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/nitha/Drivers/drivers/chromedriver-win64/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://google.com");
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());

//        System.setProperty("webdriver.gecko.driver", "C:/Users/nitha/Drivers/drivers/geckodriver.exe");
//
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get("https://google.com");

        System.setProperty("webdriver.edge.driver", "C:/Users/nitha/Drivers/drivers/msedgedriver.exe");

        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://google.com");


        driver2.quit();
    }
}

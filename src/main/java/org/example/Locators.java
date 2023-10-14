package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

public class Locators {
  /*  public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/nitha/Drivers/drivers/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("johna@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("pass123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Ivy");
//        driver.findElement(By.cssSelector("input[id='inputUsername']")).clear();

        driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys("ivy01eira@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("password123");
        driver.findElement(By.className("signInBtn")).click();
        driver.close();
    }
*/

    public static void main(String[] args) throws InterruptedException {

String name = "Sam";
//String password = "rahulshettyacademy";
        System.setProperty("webdriver.chrome.driver", "C:/Users/nitha/Drivers/drivers/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        driver.findElement(By.id("inputUsername")).sendKeys(name);
//        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//        driver.findElement(By.className("signInBtn")).click();
//        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//        driver.findElement(By.linkText("Forgot your password?")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
//        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
//        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
//        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        //System.out.println(driver.findElement(By.tagName("h2")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']//h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();
    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.linkText("Forgot your password?")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
            String passwordText = driver.findElement(By.cssSelector("form p")).getText();  //Please use temporary password 'rahulshettyacademy' to Login.
            String[] passwordArray = passwordText.split("'"); //0th index (Please use temporary password )
                                                               //1st index (rahulshettyacademy)
                                                               //2nd index ( to Login.)

            String password = passwordArray[1];
           System.out.println(password);
            return password;

    }
}

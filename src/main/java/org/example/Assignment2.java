package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class Assignment2 {
        public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");


          // Name
//        WebElement name= driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']"));
          // WebElement name= driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-invalid.ng-touched"));
//        name.sendKeys("Nitha");
          driver.findElement(By.name("name")).sendKeys("Nitha");
          Thread.sleep(2000L);

          // Email
//        WebElement email = driver.findElement(By.xpath("//input[@name='email'and@class='form-control ng-pristine ng-invalid ng-touched']"));
//        email.sendKeys("nitha@yahoomail.com");
          driver.findElement(By.name("email")).sendKeys("Nitha@abc.com");
          Thread.sleep(2000L);

        //Password
        WebElement password = driver.findElement(By.id("exampleInputPassword1"));
        password.click();
        password.sendKeys("password123");
        Thread.sleep(2000L);

        //Checkbox
        WebElement checkbox = driver.findElement(By.id("exampleCheck1"));
        checkbox.click();

        //Radio Button
        WebElement radioButton = driver.findElement(By.xpath("//div[@class='form-check form-check-inline']//input[@id='inlineRadio1']"));
        radioButton.click();
        Thread.sleep(2000L);

        //Gender
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select gender = new Select(dropdown);
        gender.selectByVisibleText("Female");
        Thread.sleep(2000L);


        //Date od Birth
        WebElement dob = driver.findElement(By.xpath("//div[@class='form-group']//input[@name='bday']"));
        dob.click();
        dob.sendKeys("01/02/1999");
        Thread.sleep(2000L);
        //Submit
        WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
        submit.click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
        Assert.assertEquals("Success! The Form has been submitted successfully!.",
                driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class AutoSuggestive {

    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000L);
        driver.findElement(By.id("autosuggest")).sendKeys("US");
        Thread.sleep(2000L);



        //Actions action = new Actions(driver);
        //WebElement country = driver.findElement(By.xpath("//ul[@id='ui-id-1']//a[text()='United States (USA)']"));
        //country.click();
        //action.moveToElement(country).build().perform();

        List<WebElement> options =driver.findElements(By.xpath("//ul[@id='ui-id-1']//li[@class='ui-menu-item']//a"));
        for (WebElement option:options) {
          if(option.getText().equalsIgnoreCase("United States (USA)")){
              Thread.sleep(2000L);
              option.click();
              break;
          }
        }

        //driver.close();
    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {

        public static void main(String[]args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
            Thread.sleep(2000L);
            driver.findElement(By.xpath("//a[@value='BLR']")).click();
            Thread.sleep(2000L);
           // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

            //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
            //xpath without index "//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']"
           driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

//            WebElement ele =driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']"));
//           ele.click();

            WebElement ele =driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover"));
           ele.click();

        }
    }


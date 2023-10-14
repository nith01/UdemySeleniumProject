package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //  Assert.assertFalse( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.xpath("//div[@id='discount-checkbox']//div[1]")).click();
        // driver.findElement(By.xpath("//div[@id='discount-checkbox']//div[2]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        // Assert.assertTrue( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Thread.sleep(2000L);
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000L);
//            int i =0;
//            while(i<4) {driver.findElement(By.id("hrefIncAdt")).click();
//                i++;}
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        Thread.sleep(2000L);
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000L);

        //System.out.println(   driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("is Enabled");
            Assert.assertTrue(true);

        }
        else System.out.println("is Disabled");
        Assert.assertTrue(false);
       // driver.close();
    }
}

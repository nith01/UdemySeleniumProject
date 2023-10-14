package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(0);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(3000);
        dropdown.selectByVisibleText("INR");
        Thread.sleep(3000);
        dropdown.selectByValue("USD");
        Thread.sleep(3000);
        driver.close();
    }
}

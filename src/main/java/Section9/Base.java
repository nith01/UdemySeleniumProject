package Section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Base {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/nitha/Drivers/drivers/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        String[] items = {"Cucumber", "Brocolli", "Tomato", "Grapes", "Musk Melon"};
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(2000L);
        addItems(driver, items);

    }

    public static void addItems(WebDriver driver, String[] items) throws InterruptedException {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String[] name1 = products.get(i).getText().split("-");  //Split vegetable name Eg:-Cucumber - 1 Kg to Cucumber
            String name2 = name1[0].trim();
            List al = Arrays.asList(items);

            if (al.contains(name2)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
                if (j == items.length) {
                    break;
                }
            }
        }
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[text()='Apply']")).click();

        //explicit wait in Selenium4
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));

        System.out.println(  driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
    }
}

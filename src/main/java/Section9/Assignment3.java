package Section9;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/nitha/Drivers/drivers/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        Thread.sleep(2000L);
        //Username
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        //Password
        driver.findElement(By.id("password")).sendKeys("learning");
        Thread.sleep(2000L);
        //Radio Button
        driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        //dropdown
        WebElement dropdown =  driver.findElement(By.xpath("//select[@class='form-control']"));
        Select s = new Select(dropdown);
        s.selectByVisibleText("Consultant");
        //Checkbox
        driver.findElement(By.id("terms")).click();
        //Signin
        driver.findElement(By.id("signInBtn")).click();
        String[] items = {"iphone", "Samsung", "Nokia", "Blackberry"};
        addToCart(driver, items);
    }
    public static void addToCart(WebDriver driver, String[] items) throws InterruptedException {
        int j = 0;
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']"));
        for (int i = 0; i < products.size(); i++) {
        String[] name1 = products.get(i).getText().split(" ");
        String name2 = name1[0].trim();

            List al = Arrays.asList(items);

            if (al.contains(name2)) {
                j++;
                driver.findElements(By.xpath("//div[@class='card-footer']//button")).get(i).click();
                if (j == items.length) {
                    break;
                }
            }
        }
        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();

    }
}

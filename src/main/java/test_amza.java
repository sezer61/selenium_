import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test_amza {
    WebDriver driver;
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\sezer\\IdeaProjects\\Selenium_Amazon\\dri\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");
        driver.findElement(By.id("add-to-cart-button")).click();


    }

}

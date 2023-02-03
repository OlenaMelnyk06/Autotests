package PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    protected WebDriver driver;
    public String getURL() {
        return driver.getCurrentUrl();
    }
    public void sleep(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public void goToRozetka() {
        driver.get("https://rozetka.com.ua/");
    }
    public void goToPlayMarket(){
        driver.get("https://play.google.com/store/games");

    }
    public void goToSite(String site){
        driver.get(String.format("https://%s.com.ua/", site.toLowerCase()));
    }
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void turnDown(){
        driver.quit();}

    }
